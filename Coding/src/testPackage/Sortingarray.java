package testPackage;

import java.util.Arrays;

public class Sortingarray {

	// arrange the array in ascending order

	static int i;

	public static void sorting(int array[]) {
		int temp = 0;
		System.out.println("sorted array: ");
		int sortarray = 0;
		// Arrays.sort(array);
		// System.out.println("using sort method" + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

			System.out.print(array[i] + " ");

		}
		System.out.println("odd consecutive number ");
		int k = 0;

		for (int l = 0; l < array.length; l++) {
			if (array[l + 1] - array[l] == 1)
				continue;

			else
				System.out.print(array[l+1]);
			break;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 1 3 5 6 13 14 15 16 17 19 20 21

		int array[] = {21, 22, 23, 4, 5, 6, 1, 3, 2, 9, 10, 11, 56, 57, 58, 78, 79, 100 };

		sorting(array);

	}
}
