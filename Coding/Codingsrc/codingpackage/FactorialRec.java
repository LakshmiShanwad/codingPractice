package codingpackage;

public class FactorialRec {

	static int method(int a)

	{
		if (a == 0)
			return 1;
		return a * method(a - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(method(21));
	}

}
