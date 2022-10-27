package ArrayProgram;

public class Peekindex {
    public static void main(String[] args) {
        System.out.println(findPeekindex(new int[]{5, 10, 20, 15}, 4));
        System.out.println(findPeekindex(new int[]{10, 20, 15, 2, 23, 90, 67}, 7));
        System.out.println(findPeekindex(new int[]{5, 10}, 2));
        System.out.println(findPeekindex(new int[]{5,1}, 2));
        System.out.println(findPeekindex(new int[]{-6,-5,-2,-7}, 4));
    }

    public static int findPeekindex(int[] arr,int n)
    {
        if(n==1)
        {
            return arr[0];
        }
        if (arr[0]>=arr[1])
        {
            return arr[0];
        }
        if (arr[n-1]>=arr[n-2])
        {
            return arr[n-1];
        }
        for (int i = 1; i <n-1 ; i++) {
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            {
                return arr[i];
            }

        }
        return -1;
    }
}
