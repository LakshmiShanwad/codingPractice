/**
 * 
 */
package stringCoding;

/**
 * @author ashutoshksingh this is to find unique string combination repetition
 *         not allow
 *
 */
public class UniqueStringCombination {

	

	public static boolean shouldswap(char ch[], int start, int current) {

		for (int i = start; i < current; i++) {
			if (ch[i] == ch[current]) {
				return false;
			}

		}

		
		return true;

	}

	static void findpermutation(char ch[], int index, int n) {
		if (index >= n) {
			System.out.println(ch);
			return;
		}
		for (int i = index; i < n; i++) {
		
			boolean check = shouldswap(ch, index, i);
			
			if (check) {
				

				swap(ch, index, i);
				findpermutation(ch, index + 1, n);
				swap(ch, index, i);
				

			}
		}
	

	}

	static void swap(char ch[], int i, int j) {

		
		char c = ch[i];
		ch[i] = ch[j];
		ch[j] = c;


	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "aab";
		char ch[] = inputString.toCharArray();
		int n = ch.length;
		findpermutation(ch, 0, n);
		System.out.println();

	}

}
