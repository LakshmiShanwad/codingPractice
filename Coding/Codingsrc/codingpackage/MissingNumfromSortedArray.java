package codingpackage;

public class MissingNumfromSortedArray {

	public static void method(int[] a, int len) {
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i + 1] - a[i] > 1) {
				int b = a[i + 1] - a[i];
				while (b < a[i + 1]) {
					System.out.println(" missing number " + b);

				}

			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 6, 8, 13, 14, 15 };
		int len = a.length;
		method(a, len);

		Object ab = new Object();
	}

}
