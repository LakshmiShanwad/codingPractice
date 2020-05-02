/**
 * 
 */
package codingpackage;

import java.util.Arrays;

/**
 * @author ashutoshksingh
 *
 */
public class KthSmallestNumber {

	/**
	 * @param args
	 */

	public static int kthnumber(int a[], int len, int k) {

		if (k > len) {
			return 0;
		}
		Arrays.sort(a);
		return a[k - 1];
	}

	static  int ksmallnumber(int a[], int len, int k) {
		if (k > len) {
			return 0;
		}

		// below method used for sorting manually

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		return a[k-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int a[] = { 1, 7, 10, 4, 3, 20, 15 };
		int user=1;
		if(user==1)
		
		System.out.println(kthnumber(a, a.length, k));
		
		else 
			System.out.println(ksmallnumber(a, a.length, k));
			

	}

}
