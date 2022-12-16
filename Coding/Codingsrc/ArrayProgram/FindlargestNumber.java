package ArrayProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class FindlargestNumber {
    // Find largest number without using sorting
    static int findLargest(int[] a) {
        if (a.length == 1) {
            return a[a.length - 1];

        }
        int n = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > n) {
                n = a[i];
            }
        }
        return n;
    }

    // find largest using LIST

    static int findLargest(List<Integer> ls) {
        int n = Integer.MIN_VALUE;
        for (Integer a : ls
        ) {
            if (a > n) {
                n = a;
            }

        }
        return n;

    }

    // Find Second largest number without using sorting
    static int secondLargest(int a[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        if (a.length < 2) {
            return -1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] > second) {
                second = a[i];
            }
        }
        return second;

    }

    // find largest 3 number in an array without using sort;

    static int threeLargest(int a[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        if (a.length < 3) {
            return -1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > first) {
                // this sequence is fix
                third = second;
                second = first;
                first = a[i];
            } else if (a[i] > second) {
                third = second;
                second = a[i];
            } else if (a[i] > third) {
                third = a[i];
            }
        }
        return second * first * third;

    }



    public static int findMin(int[] arr) {
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n) {
                n = arr[i];
            }
        }
        return n;
    }

    public static int findLargestusingPQ(int[] nums)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0;i< nums.length;i++)
        {
            pq.add(nums[i]);
        }
        return pq.poll();
    }

    public static int findSmallestusingPQ(int nums[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        return pq.poll();
    }
    public static void main(String args[]) {
        System.out.println(" Find laregst value is  >>>>>>> " + findLargest(new int[]{1000, 1258, 12, 1, 2, 9, 5, 23}));
        System.out.println(" Find laregst value is  PQ>>>>>>> " + findLargestusingPQ(new int[]{1000, 1258, 12, 1, 2, 9, 5, 23}));
        System.out.println(" Find 2nd largest value is  >>>>>>> " + secondLargest(new int[]{100, 25485, -987455455}));
        System.out.println(" Find 3rd largest value is  >>>>>>> " + threeLargest(new int[]{9, 8, 7}));
        List<Integer> ls = new ArrayList<>();
        ls.add(8);
        ls.add(9);
        ls.add(7);
        ls.add(2);
        System.out.println(" Find largest value using list is  >>>>>>> " + findLargest(ls));
        System.out.println(" Find minimum value is  >>>>>>> " +findMin(new int[] {1000, -1258, 12}));
        System.out.println(" Find minimum value is  PQ>>>>>>> " + findSmallestusingPQ(new int[]{1000, -1258, 12}));

    }
}
