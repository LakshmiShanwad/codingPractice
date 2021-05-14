package stringCoding;

public class ConvertfirstCharactertoUpperCase {

	static String s2 = "";
	static String ans = "";
	static String fchar;

	static String conversion(String InputStr) {
		String[] S1 = InputStr.trim().split(" ");

		for (int i = 0; i < S1.length; i++) {
			char ch[] = S1[i].toCharArray();

			fchar = Character.toString(ch[0]).toUpperCase();

			for (int j = 0; j < ch.length - 1; j++) {
				s2 += Character.toString(ch[j + 1]);
			}

			ans += fchar + s2;
			s2 = "";

		}

		return ans;

	}

	public static void main(String[] args) {

		String example = "This is java and service now and i am striving for the serviceNow";
		System.out.println(conversion(example));
	}

}
