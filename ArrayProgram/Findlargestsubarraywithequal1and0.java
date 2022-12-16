package ArrayProgram;

import java.util.HashMap;

/*
Find the largest sub array that will contain equal number of 1 and 0
input = {1,1, 0, 0, 1, 1, 0,  0 }
replace the 0 with -1 and then
find the largest subarray with sum 0 that will solve the issue
 */
public class Findlargestsubarraywithequal1and0 {
    public static void main(String[] args) {
        solve(new int[]{1, 1, 0, 0, 1, 1, 0, 0}, 0);
    }

    public static void solve(int[] input, int targetsum) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                input[i] = -1;
            }
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int currentsum = 0;
        int start = 0;
        int end = -1;
        for (int j = 0; j < input.length; j++) {
            int diff = currentsum-targetsum;
            if (hashMap.containsKey(diff))
            {
                start=hashMap.get(diff)+1;
                end=-1;
                break;
            }
            hashMap.put(currentsum,j);
        }
        if (end==-1)
        {
            System.out.println(" Not found" );

        }
        else
        {
            System.out.println(start + " " + end);
        }

    }
}
