package testPackage;

import java.util.ArrayList;
import java.util.List;

public class Eullerproblem1 {

	// Find the sum of all the multiples of 3 or 5 below 1000.

	static int sum = 0;
	static int i=1 ;
	static List<Integer> lt = new ArrayList<Integer>();

	public static void method1(int n1, int n2,int limit)

	{
		
		while (lt.size() < limit) {

			if (i % n1 == 0 || i % n2 == 0) {
				sum = sum + i;

				System.out.println(i);
				lt.add(i);
				
			}
			i++;
			

		}

		System.out.println("<<>>>" + sum + "<<>>" + lt.size());
	}

	public static void main(String args[]) {
		method1(3, 5,1000);
	}
}
