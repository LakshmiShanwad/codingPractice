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

    public static void main(String args[]) {
        int arr[] = {8, 11, 56};
        int low = 0;
        int high = arr.length - 1;
        int result = floorNum(arr, low, high, 12);
        System.out.println(arr[result]);
    }
}
