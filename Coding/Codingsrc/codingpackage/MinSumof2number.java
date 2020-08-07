/**
 * 
 */
package codingpackage;

/**
 * @author ashutoshksingh
 *
 */
public class MinSumof2number {

	public static void minsum(int a[], int len) {
		if (len < 2) {
			System.out.println(" invalid input");
		}

		int i, j, min_sum, sum,
		min_i, min_j;
		

		min_sum = a[0] + a[1];
		min_i= 0;
		min_j=1;
		for (i = 0; i < len - 1; i++) 
		{
			for (j = i + 1; j < len; j++) 
			{
				sum = a[i] + a[j];
				if (Math.abs(min_sum) > Math.abs(sum)) 
				{
					min_sum = sum;
					min_i = i;
					min_j = j;

				}

			}

		}

		System.out.println(a[min_i] +" " +  a[min_j] + " at index of "+min_i +" "+min_j);
	}

	public static void main(String args[]) {
		int a[] = {1, 2,4,2,-8,-5};;
		int len = a.length;
		minsum(a, len);

	}
}
