package codingpackage;

public class twodmatrix {
	// THIS IS TO PRINT JUST PRIME NUMBER IN SQUARE MATRIX

	static int primeCounter = 2;

	public static int getPrime() {
		for (int i = 2; i < primeCounter; i++) {
			if (primeCounter % i == 0)
			{
				primeCounter++;
				getPrime();
				break;
			} else {
				continue;
			}

		}
		return primeCounter;
	}

	public static void twoDMatrixPrimePrint(int n) {
		int twoDMatrix[][] = new int[n][n];
		for (int i = 0; i < twoDMatrix.length; i++) {
			for (int j = 0; j < twoDMatrix.length; j++) {
				System.out.print(getPrime() + "\t");
				primeCounter++;
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// int n = 3;
		twoDMatrixPrimePrint(3);
	}

}
