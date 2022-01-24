package ArrayProgram;

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

    public static void main(String args[]) {
        System.out.println(findLargest(new int[]{1000, 1258, 12, 1, 2, 9, 5, 23}));
        System.out.println(secondLargest(new int[]{100, 25485, -987455455}));
        System.out.println(threeLargest(new int[]{-8, 10, 1, 2}));

    }
}
