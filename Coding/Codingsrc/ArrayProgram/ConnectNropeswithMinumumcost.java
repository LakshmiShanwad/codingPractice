package ArrayProgram;

import java.util.PriorityQueue;

/*
You have N ropes you have to connect those ropes to such that cost of connection is minimum
assuming cost = length of the rope
input = 2,5,4,8,6,9
output = should be the minimum cost
solution : Start with adding the small small rope

 */
public class ConnectNropeswithMinumumcost {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 5, 4, 8, 6, 9}));
        System.out.println(solve(new int[]{2, 15, 452, -8, -6, -9}));
        System.out.println(solve(new int[]{0, 0, 0, 0, 0, 9}));
        System.out.println(solve(new int[]{-2, -05, -4, -8, -6, -9}));


    }

    public static int solve(int arr[]) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            priorityQueue.add(arr[i]);
        }
        while (priorityQueue.size() > 1) {
            int first = priorityQueue.poll();
            int second = priorityQueue.poll();
            int sum = first + second;
            answer += sum;
            priorityQueue.add(sum);
        }
        return answer;
    }
}
