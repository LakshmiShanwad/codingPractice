package practiceonly;

public class RandomNumberSum100 {

	public static void main(String[] args) {
		while (true) {
			int firstNum = (int) ((Math.random()) * 101);
			int SecNum = (int) ((Math.random()) * 101);
			int ThreeNum = (int) ((Math.random()) * 101);
			int FourthNum = (int) ((Math.random()) * 101);
			int FifthNum = (int) ((Math.random()) * 101);

			if (firstNum == 0 || SecNum == 0 || ThreeNum == 0 || FifthNum == 0 | FourthNum == 0) {
				continue;

			}

			else if ((firstNum + SecNum + ThreeNum + FifthNum + FourthNum) == 100) {
				System.out.println("first number = " + firstNum);
				System.out.println("second number = " + SecNum);
				System.out.println("third number = " + ThreeNum);
				System.out.println("fourth number = " + FourthNum);
				System.out.println("fifth number = " + FifthNum);
				break;

			}

		}

	}

}
