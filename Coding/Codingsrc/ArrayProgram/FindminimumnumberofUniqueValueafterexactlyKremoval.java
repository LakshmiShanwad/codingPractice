package ArrayProgram;

import java.util.HashMap;
import java.util.PriorityQueue;

public class FindminimumnumberofUniqueValueafterexactlyKremoval {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, 5, 4}, 1));
        System.out.println(solve(new int[]{3, 3, 4,5}, 2));
    }

    public static int solve(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(hm.values());
        while (k > 0) {
            k -= pq.poll();
        }
        return k < 0 ? pq.size() + 1 : pq.size();
    }
}
