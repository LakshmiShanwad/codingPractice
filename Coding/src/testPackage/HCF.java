package testPackage;

public class HCF {

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	// Driver method
	public static void main(String[] args) {
		int a = 9, b = 7, lcm;
		System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
		int temp = (a*b)/(gcd(a,b));
		System.out.println("lcm of number "+ temp);
	}
}
