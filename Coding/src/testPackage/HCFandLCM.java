package testPackage;

public class HCFandLCM {

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		int x = b;
		int y = a % b;
		return gcd(x, y);
	}

	// Driver method
	public static void main(String[] args) {
		int a = 2, b = 7, asd = 100;
		System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
		System.out.println("print" + asd);
		int LCMtemp = (a * b) / (gcd(a, b));
		System.out.println("lcm of number " + LCMtemp);
	}
}
