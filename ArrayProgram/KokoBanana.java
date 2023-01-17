package ArrayProgram;

/*Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k.
Each hour, she chooses some pile of bananas and eats k bananas from that pile.
If the pile has less than k bananas,
she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.
Testing webhook with this commit
*/

public class KokoBanana {
    public static int minEatingSpeed(int[] pile,int h) {
        int max = Integer.MIN_VALUE;
        for (int val : pile
        ) {
            max = Math.max(val, max);
        }
        if (h == pile.length) {
            return max;
        }
        int low = 0;
        int high = max;
        int speed = Integer.MAX_VALUE;

        while (low <= high) {
            int sp = low + ((high - low) / 2); //
            // avoid overflow because we are working not on index but on value;
            if (isPossibe(pile, sp, h)) {
                speed = sp;
                high = sp -1;
            } else
                low = sp + 1;
        }
        return speed;
    }

    private static boolean isPossibe(int[] piles, int sp, int h) {
        int time=0;
        for(int i=0;i<piles.length;i++)
        {
            time+=(int)Math.ceil(piles[i]*1.0/sp);
        }
        return time<=h;
    }

    public static  void main(String args[])
    {
        int pile[] ={3,6,7,11};
        int h= 8;
        System.out.println(minEatingSpeed(pile,h));

    }
}
