package codingpackage;

import java.util.Scanner;

public class HCFandLCM {

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return (gcd(b, a % b));
	}

	// Driver method
	public static void main(String[] args) {

		// @SuppressWarnings("resource")
		/*
		 * Scanner objscn = new Scanner(System.in);
		 * System.out.println("ENTER THE FIRST NUMBER "); float num1 =
		 * objscn.nextFloat(); System.out.println("ENTER THE Second NUMBER "); float
		 * num2 = objscn.nextFloat(); System.out.println(" the entered numbers are " +
		 * num1 + " AND " + num2);
		 */
		int a = 0, b = 2;
		// HCF*LCM = a*b
		System.out.println("hcf SHORT" + gcd(a, b));
		System.out.println("lcm of number " + (a * b) / (gcd(a, b)));
		System.out.println("HCF of the number is " + gcd(a, b));
	}
}
