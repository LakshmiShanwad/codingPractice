package testPackage;

public class ArrayRotation {

	void roatearray(int a[], int d, int n) {
		for (int i = 0; i < d; i++)
			rotateArraybyone(a, n);

	}

	void rotateArraybyone(int a[], int n) {
		int i, temp = a[0];
		for (i = 0; i < n - 1; i++)

			a[i] = a[i + 1];
		
		a[i] = temp;

	}

	void printArray(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotation ob = new ArrayRotation();

		int a[] = { 1, 2, 3, 4};
		int len = a.length;
		ob.roatearray(a, 2, len);
		ob.printArray(a, len);

	}

}
