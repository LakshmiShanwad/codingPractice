/**
 * 
 */
package codingpackage;

/**
 * @author ashutoshksingh
 *
 */
public class SmallNumSumofDigitN {

	/**
	 * @param args
	 *            find the smallest number whose sum of digit is N Input: N = 10
	 *            Output: 19 Explanation: 1 + 9 = 10 = N Input: N = 18 Output: 99
	 *            Explanation: 9 + 9 = 18 = N
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N= 10;
		System.out.print((N % 9 + 1) * 
	            Math.pow(10, (N / 9)) - 1);
		
	}

}
