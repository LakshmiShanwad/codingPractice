package testPackage;

public class LCM {

	public void lcm() {
		System.out.println(" lcm");

		int a = 3;
		int b = 9;
		int lcm = 0;
		int max, step;

		if (a > b)
			max = step = a;
		else
			max = step = b;

		while (a != 0) {
			if (max % a == 0 && max % b == 0)

			{
				lcm = max;
				break;

			}
			max = max + step;

		}
		System.out.println("LCM of given numbers is :: " + lcm);

	}

	public void lcm2() {
		int a = 3;
		int b = 9;
		int lcm = 0;
		int tempmulti = a * b;
		int templcm = tempmulti;
		while (tempmulti % a == 0 && tempmulti % b == 0) {
			templcm = tempmulti;
			tempmulti = tempmulti / 2;

			continue;

		}

		int x= 3%4;
		System.out.println("X>>" + x);
		System.out.println("" + templcm);

	}

	// Driver method
	public static void main(String[] args) {
		LCM obj = new LCM();
		obj.lcm();
		obj.lcm2();

	}
}
