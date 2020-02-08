package testPackage;

import java.util.HashSet;
import java.util.Set;

public class Zxy1 extends Zxy {

	String s = "abca";
	String stemp = "";
	String newString = "";
	char c[] = s.toCharArray();

	Set<Character> st = new HashSet<>();

	public void store() {
		for (char ch : c) {
			st.add(ch);

		}

		System.out.println(" set is " + st);
		newString = st.toString();
		Object[] str1 = st.toArray();

		StringBuilder strb = new StringBuilder();

		for (int j = 0; j < str1.length; j++) {
			strb.append(str1[j]);
		}
		stemp = strb.toString();

		System.out.println(newString);
		System.out.println(strb);

	}

	public static void permu(String str, String ans) {

		char ch = 0;
		String ros = "";
		if (str.length() == 0) {
			System.out.print(ans + "");
			System.out.print(" ");
		}
		

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			ros = str.substring(0, i) + str.substring(i + 1);
			permu(ros, ans + ch);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zxy1 obj = new Zxy1();

		obj.store();

		permu(obj.stemp,"");

	}
}
