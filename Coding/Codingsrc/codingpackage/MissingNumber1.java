/**
 * 
 */
package codingpackage;

/**
 * @author ashutoshksingh
 *
 */
public class MissingNumber1 {

	/**
	 * @param argsFind
	 *            the Missing Number in an sorted array
	 */

	public static int findnum(int a[], int n)

	{
		int i, total, sum = 0;
		total = ((n + 1) * (n + 2)) / 2;
		for (i = 0; i < n; i++) {
			sum = sum + a[i];

		}

		return (total - sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		System.out.println("Missing number is :) :) " + findnum(a, a.length) + ":) :) :) ");

	}

}
