package codingpackage;

public class Pattern1 {

	public static void method() {
		for (int row = 1; row <= 9; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*" + " ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();

	}

}
