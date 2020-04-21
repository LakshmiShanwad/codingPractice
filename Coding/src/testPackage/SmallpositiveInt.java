package testPackage;

import java.util.Arrays;

/*Write a function:

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
*/

public class SmallpositiveInt {

	static int i, v;
	// static int a[] = { 1, 3, 6, 4, 1, 2 };
	static int a[] = { 1,2,5,6, };
	// static int a[] = {-3,-1};

	public static int solution() {

		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length - 1; i++) {
			if (!(a[i + 1] - a[i] >= 0 || (a[i + 1] - a[i]) == 1)) {

				v = a[i] + 1;

			} else
				v = a[i] + 2;
		}
		if (a[a.length - 1] < 0)
			v = 1;
		System.out.println();

		return (v);

	}

	public static void main(String args[]) {

		System.out.println("THE MISSING SMALLEST VALUS IS  " + solution());

	}

}
