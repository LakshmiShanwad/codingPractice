package ArrayProgram;

import java.util.HashMap;

// find the continous subarray whose sum will make a given target and return the index and value of the same
//incomplete
public class Subarraywiththegivensum {
    public static void solve(int[] input, int targetsum) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int currentsum = 0;
        int start = 0;
        int end = -1;
        int i;
        for (i = 0; i < input.length; i++) {
            currentsum += input[i];
            int diff= currentsum-targetsum;
            if(currentsum-targetsum==0)
            {
               end=i;
               break;
            }
            if (hashMap.containsKey(diff))
            {
                start = hashMap.get(diff) + 1;
                end = i;
                break;
            }
            hashMap.put(currentsum,i);
        }
        if (end == -1) {
            System.out.println(" not found ");
        } else {
            System.out.println(" Indexes are " + start + "  " + end);
            System.out.println(" And the array value the will  make the sum is ");
           for(int b=start;b<=end;b++)
            {
                System.out.print(" " + input[b] + "\t");
            }

        }
    }

    public static void main(String[] args) {
        int in[] = {5, 4, 3, 2, 7};
       // solve(in, 12);
        solve(new int[]{10,15,-5,15,-10,5}, 20);
    }
}
