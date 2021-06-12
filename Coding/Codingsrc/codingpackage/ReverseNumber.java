package codingpackage;

public class ReverseNumber {

	static int reverseNumber(int n) {

		int rev = 0;

		while (n != 0) {
			if (n > Integer.MIN_VALUE)
				return 0;

			rev = rev * 10 + n % 10;

			n = n / 10;

		}
		return rev;

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" rec " + reverseNumber(1534236469));
	}

}
