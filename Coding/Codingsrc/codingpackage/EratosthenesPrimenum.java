package codingpackage;

public class EratosthenesPrimenum {

	static void checkPrime(int N) {
		System.out.println(" ");
		boolean prime[] = new boolean[N + 1];
		for (int i = 0; i <= N; i++) {
			prime[i] = true;

		}
		for (int p = 2; p * p <= N; p++) {
			if (prime[p] == true) {
				for (int i = p * p; i <= N; i += p) {
					prime[i] = false;
				}
			}
		}
		System.out.println("<<<printing prime number::eratosrhenes algo till user defined input >>> " + N + "\n");
		for (int i = 2; i <= N; i++) {
			if (prime[i] == true)
				System.out.println(" prime number " + i);
		}
	}

	static boolean isPrime(int N) {
		for (int i = 2; i <= N - 1; i++)
			if (N % i == 0)
				return false;

		return true;
	}

	public static void naivemethod(int N) {
		System.out.println(" naive methods prime number");

		for (int i = 2; i <= N; i++) {
			if (isPrime(i))
				System.out.println(" Naive method" + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userRange = 900000000;

		if (userRange < 0 || userRange <= 1) {
			System.out.println(" can not be negative range or 1 as first prime number starts with 2");
		} else
			//checkPrime(userRange);
		 naivemethod(10000000);

	}

}
