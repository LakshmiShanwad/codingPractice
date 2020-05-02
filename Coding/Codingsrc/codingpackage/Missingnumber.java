package codingpackage;

public class Missingnumber {

	public void meth()

	{

		int a[] = { 10, 7, 5, 13, 2, 1, 5 };
		// int a[] = { 1, 5, 7, 8, 9, 0, 11, 34 };

		if (a.length > 3) {

			for (int i = 0; i < a.length - 1; i++) {
				int c = a[i];
				int d = a[i + 1];
				if (c > d)
					continue;
				else
					System.out.println(d);

			}

		} else
			System.out.println("can not determine");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Missingnumber obj = new Missingnumber();
		obj.meth();

	}

}
