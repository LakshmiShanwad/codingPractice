package codingpackage;

public class FactorialRec {

	static long method(long a)

	{
		if (a == 0)
			return 1;
		return a * method(a - 1);

	}

	public static void main(String[] args) {

		System.out.println(method(10));
	}

}
