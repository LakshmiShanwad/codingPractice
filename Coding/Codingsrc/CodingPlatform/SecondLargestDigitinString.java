package CodingPlatform;

/*Given an alphanumeric string s,return the second largest numerical digit that appears in s,or-1 if it does not exist.

An alphanumeric string is a string consisting of lowercase English letters and digits. 1796*/
public class SecondLargestDigitinString {

	static int largesecond(String s) {
		int count[] = new int[10];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				count[c - '0']++;

			}

		}

		boolean flag = false;

		for (int i = 9; i >= 0; i--) {
			if (count[i] > 0) {
				if (!flag) {
					flag = true;
				} else
					return i;

			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "dfa12321afd";
		System.out.println(largesecond(s));

	}

}
