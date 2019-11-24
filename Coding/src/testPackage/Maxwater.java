package testPackage;

public class Maxwater {
	int sum = 0;

	public void maxwater() {
		int i = 0;

		int temp;
		int max = 0;

		int a[] = { 0, 2, 1, 3, 1, 0, 2, 4 ,6};
		int size = a.length;
		while (i < a.length - 1) {
			if (a[i] < a[i + 1] || a[i] < max) {
				temp = a[i + 1];
				sum = sum + max - a[i];

			} else {

				temp = a[i];
				sum += max - a[i];
			}
			if (max < temp)
				max = temp;

			i++;

		}
		System.out.println(" max water " + sum);

	}

	public static void main(String args[]) {
		Maxwater obj = new Maxwater();
		obj.maxwater();
	}
}
