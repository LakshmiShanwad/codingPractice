package codingpackage;

public class SumOfNumbertoSingleDigit {
	static int tempSum = 0;

	public static int finalAnswer(int inputNum) {
		while (inputNum != 0) {
			tempSum += inputNum % 10; // 8
			inputNum /= 10;// 79
		}
		int finalSum = tempSum;
		tempSum = 0;
		if (finalSum < 10) {
			System.out.println(finalSum);
		} else {
			finalAnswer(finalSum);
		}
		return finalSum;
	}

	static int murari(int n) {
		int sum = 0;
		while (n > 0 || sum > 9) {
			if (n == 0) {
				n = sum;
				sum = 0;
				// return sum;
			}
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(order(789));
		// finalAnswer(1);
		// System.out.println((finalAnswer(789876)));
		System.out.println(murari(1245));
	}

}
