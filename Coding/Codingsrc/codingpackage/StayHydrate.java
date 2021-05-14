package codingpackage;

public class StayHydrate {

	static int method(double d) {

		if (((int) (d) % 2) == 0)
			return (int) (d) / 2;

		else

			return ((int) (d) - 1) / 2;
	}

	public static void main(String args[]) {
		System.out.println("Liter of water needed is : " + method(3));
		System.out.println("Liter of water needed is : " + method(6.7));
		System.out.println("Liter of water needed is : " + method(11.8));
	}
}
