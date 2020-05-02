package practiceonly;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST {

	static void add(int a[], int n) {
		int i = n;
		if (a[i] < 9) {
			a[i] = a[i] + 1;
			return;
		}
		a[i] = 0;
		i--;
		add(a, i);

		if (a[0] > 0)

			System.out.print(a[0] + ",");

		for (i = 1; i <= n; i++)

		{
			System.out.print(a[i]);

			if (i <= n)
				System.out.print(", ");

		}
	}

	public static void main(String args[]) {

		// int n = 3;
		int arr[] = { 0, 9, 9 };
		// System.out.println(arr[n - 1]);
		add(arr, arr.length - 1);

	}

}
