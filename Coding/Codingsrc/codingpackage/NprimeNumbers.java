package codingpackage;

public class NprimeNumbers {

	static int counter = 1;
	static int i = 2;

	static void primenum(int limit) {
		while (counter < limit) {
			if (i % counter == 0)
				i++;
			counter++;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primenum(10);

	}

}
