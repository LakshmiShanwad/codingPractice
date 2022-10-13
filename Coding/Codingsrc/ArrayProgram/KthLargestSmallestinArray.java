package ArrayProgram;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestSmallestinArray {
    public static void main(String[] args) {
        solve(new int[]{2, 1, 21, 4}, 2);
        System.out.println(findSmallest(new int[]{2, 1, 21, 4}, 2));
    }

    public static void solve(int[] in, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(in[i]);
        }
        for (int j = k; j < in.length; j++) {
            if (in[j] > pq.peek()) {
                pq.poll();
                pq.add(in[j]);
            }
        }
        System.out.println(pq.peek());
    }

    public static int  findSmallest(int[] n, int ksmallest) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<ksmallest; i++)
        {
            priorityQueue.add(n[i]);
        }
        for (int i=ksmallest;i<n.length;i++)
        {
            if (n[i]<priorityQueue.peek())
            {
                priorityQueue.poll();
                priorityQueue.add(n[i]);
            }
        }
        return priorityQueue.peek();
    }
}
