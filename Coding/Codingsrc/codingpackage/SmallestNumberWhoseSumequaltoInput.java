package codingpackage;

public class SmallestNumberWhoseSumequaltoInput {

	static int method(int N) {

		int sum = 0;
		while (N != 0) {

			sum += N % 10;
			N = N / 10;
		}
		return sum;
	}

	static int small(int N) {
		int a = method(N);
		for (int i = N + 1;; i++) {

			if (a == method(i)) {
				return i;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println(small(1000));

	}

}
