package testPackage;

import java.util.Scanner;

public class HCFandLCM {

	static float gcd(float a, float b) {
		if (b == 0)
			return a;

		return gcd(b, a % b);
	}

	// Driver method
	public static void main(String[] args) {
		int a = 2, b = 7, asd = 100;
		@SuppressWarnings("resource")
		Scanner objscn = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER ");
		float num1 = objscn.nextFloat();
		System.out.println("ENTER THE Second NUMBER ");
		float num2 = objscn.nextFloat();
		System.out.println(" the entered numbers are " + num1 + " AND " + num2);
		System.out.println("GCD/HCF of " + num1 + " and " + num2 + " is " + gcd(num1,num2));
		// System.out.println("print" + asd);
		float LCMtemp = (num1 * num2) / (gcd(num1, num2));
		System.out.println("lcm of number " + LCMtemp);
	}
}
