package testPackage;

import java.util.ArrayList;
import java.util.List;

public class Eullerproblem1 {

	// Find the sum of all the multiples of 3 or 5 below 1000.

	static int sum = 0;
	static int i = 1;
	static int size = 0;

	public static void method1(int n1, int n2, int limit)

	{

		while (size < limit) {

			if (i % n1 == 0 || i % n2 == 0) {
				sum = sum + i;

				System.out.println(i);
				// lt.add(i);
				size++;

			}
			i++;

		}

		System.out.println("<<>>>" + sum + "<<>>");
	}

	public static void main(String args[]) {
		method1(14,7,20);
	}
}
