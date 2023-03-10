package ArrayProgram;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice. You can return the answer in any order.*/
public class TwoSum {

    public  static int[] output(int[] input, int target) {
        Map<Integer, Integer> hm = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            int diff = Math.abs(target - input[i]);
            if ((hm.containsKey(diff)))
            {
                int out[] = new int[2];
                out[0] = i;
                out[1] = hm.get(diff);
                return out;
            }

            hm.put(input[i],i  );
                }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] input = new int[]{2,3,5};
        int res[]=output(input,5);
        System.out.println(res[0] + "   " + res[1]);

    }
}
