package testPackage;

public class Armstrongmy {

	static int sum = 0;
	static int temp;
	static int tempval;

	static int n;

	public static int order(int num) {

		int ordernum = num;
		while (ordernum != 0) {
			n++;
			ordernum = ordernum / 10;

		}
		int temorder = n;
		n = 0;
		System.out.println("the order of the expected number is " + temorder);
		
		return temorder;

	}

	public static void checkarm(int num, int po) {
		int c = num;
		int p = po;
		while (num > 0) {
			temp = num % 10;
			int exp = (int) (Math.pow(temp, p));

			sum += exp;
			num = num / 10;

			tempval = sum;

		}
		sum = 0;

		if (tempval == c)
			System.out.println("the given num " + c + " is armstrong ");
		else
			System.out.println("the given num " + c + " is NOT a armstrong ");
		System.out.println("\n");

	}

	public static void main(String args[]) {

		int inputarray[] = { 1, 407, 8208, 54748, 548834, 4210818, 24678051, 472335975, 472335932 };
		for (int i = 0; i < inputarray.length; i++)

			checkarm(inputarray[i], order(inputarray[i]));
	}

}
