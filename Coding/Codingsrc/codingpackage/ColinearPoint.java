package codingpackage;

public class ColinearPoint {

	static int slope1;
	static int slope2;
	static int slope3;

	static boolean method1(int a[], int b[], int c[])

	{

		slope1 = Math.abs(((b[1] - a[1])) / (Math.abs((b[0] - a[0]))));
		slope2 = Math.abs((c[1] - b[1])) / Math.abs((c[0] - b[0]));
		slope3 = Math.abs((c[1] - a[1])) / Math.abs((c[0] - a[0]));

		if ((((a[0] >= 0) && (b[0] >= 0) && (c[0] >= 0)) && ((a[1] >= 0) && (b[1] >= 0) && (c[1] >= 0))
				|| ((a[0] <= 0) && (b[0] <= 0) && (c[0] <= 0)) && ((a[1] <= 0) && (b[1] <= 0) && (c[1] <= 0))
				|| ((a[0] <= 0) && (b[0] <= 0) && (c[0] <= 0)) && ((a[1] >= 0) && (b[1] >= 0) && (c[1] >= 0))
				|| ((a[0] >= 0) && (b[0] >= 0) && (c[0] >= 0)) && ((a[1] <= 0) && (b[1] <= 0) && (c[1] <= 0)))
				&& ((slope1 == slope2 && slope1 == slope3 && slope3 == slope1)))

		{
			return true;

		} else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { -2, -4 };
		int b[] = { -4, 6 };
		int c[] = { -6, -8 };

		if (method1(a, b, c)) {
			System.out.println("colinear and lie in same quadrant");
		} else
			System.out.println("NON Collineaar ERROR ");

	}

}
