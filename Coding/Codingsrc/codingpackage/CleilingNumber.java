/**
 *
 */
package codingpackage;

/**
 * @author ashutosh
 * Binary search algo for find the smallest number greater than the target number
 */
public class CleilingNumber {
    // //Smallest number greater than the target number
    public static void main(String args[]) {
        int arr[] = {8, 11, 12, 56};
        int low = 0;
        int high = arr.length - 1;
        int result = floorNum(arr, low, high, 10);
        int result1 = highNumberLessthanTarget(arr, low, high, 13);
        System.out.println(arr[result]);
        System.out.println(" Highest Number Less than target number is " + arr[result1]);
    }

    static int floorNum(int a[], int low, int high, int target) {
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (a[mid] > target) {
                high = mid - 1;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return low;
    }

    static int highNumberLessthanTarget(int a[], int low, int high, int target) {
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (a[mid] > target) {
                high = mid - 1;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return high;
    }
}
