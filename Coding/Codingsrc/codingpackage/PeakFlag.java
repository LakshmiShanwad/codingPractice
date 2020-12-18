/**
 * 
 */
package codingpackage;

/**
 * @author ashutoshksingh
 *
 */
public class PeakFlag {

	/**
	 * @param argsFind
	 *            the maximum number of flags that can be set on mountain peaks.
	 */

	static void flagcounter(int A[], int len) {
		int flag = 0;
		for (int i = 0; i < len-2; i++) {
			if (A[i] < A[i + 1] && A[i + 1] > A[i + 2])
				flag++;
		}
		System.out.println(" net flag is " + flag);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[]= {1,5,3,4,3,4,1,2,3,4,6,2};
		flagcounter(A, A.length);
	}

}
