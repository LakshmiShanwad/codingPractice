/**
 * 
 */
package codingpackage;

/**
 * @author ashutoshksingh this to sort an array when alternative is not bigger ,
 *         Pan cake problem based on sorting array the goal is to sort the
 *         sequence in as few reversals as possible. We one by one place maximum
 *         element at the end and reduce the size of current array by one.
 *
 */
public class PancakeProblem {

	/**
	 * @param args
	 */

	static void flip(int arr[], int i) {
		int start = 0, temp = 0;
		while (start < i) {
			temp = arr[start];
			arr[start] = arr[i];
			arr[i] = temp;
			start++;
			i--;
		}
	}

	/**
	 * @param args
	 *            Returns index of the maximum element in arr[0..n-1]
	 */

	static int findmax(int arr[], int n) {
		int i, mi;
		for (mi = 0, i = 0; i < n; i++)

			if (arr[i] > arr[mi])
				mi = i;

		return mi;

	}

	static int pancakes(int arr[], int n) {

		for (int curr_size = n; curr_size > 1; --curr_size) {
			int mi = findmax(arr, curr_size);
			if (mi != curr_size - 1) {
				flip(arr, mi);

				flip(arr, curr_size - 1);
			}

		}
		return 0;

	}

	/* Utility function to print array arr[] */
	static void printArray(int arr[], int arr_size) {
		for (int i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 23, 10, 20 };
		int n = arr.length;
		pancakes(arr, n);
		System.out.println(" sorted array " + "");
		printArray(arr, n);

	}

}
