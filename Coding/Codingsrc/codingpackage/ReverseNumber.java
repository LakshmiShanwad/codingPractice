package codingpackage;

public class ReverseNumber {

	static int reverseNumber(int n) {

		int rev = 0;

		while (n != 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;

		}
		return rev;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" rec " + reverseNumber(-12));
	}

}
