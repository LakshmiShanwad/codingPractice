package codingpackage;

import java.util.ArrayList;
import java.util.List;

public class RepeatedString {
	static int temp = 0;

	public static void rpeatString(int a[], int n)

	{
		int i, j;

		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n - 1; j++)
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

		}
		for (int k = 0; k < n - 1; k++)
			System.out.println(a[k]);

		List<String> ls = new ArrayList<>();
		ls.add(0, "ashutosh");
		ls.add("ab");
		ls.add("cd");
		System.out.println("list is " + ls);
		System.out.println("size is " + ls.size());
		ls.remove(1);
		for (String s : ls) {
			System.out.println(s);
		}

	}

	public static void main(String[] args) {

		int arrays[] = { 2, 89, 47, 1, 823, 13, 26, 78, 3, 4 };

		rpeatString(arrays, arrays.length);

	}

}
