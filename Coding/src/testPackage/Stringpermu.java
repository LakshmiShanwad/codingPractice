package testPackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

// this code does not handle distinct handle 
public class Stringpermu {

	static Set<String> nset = new HashSet<>();

	public static void permu(String str, String out) {
		char ch = 0;
		String ros = " ";
		if (str.length() == 0)

		{
			System.out.println(out + "");

		}

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			ros = str.substring(0, i) + str.substring(i + 1);
			permu(ros, out + ch);

		}

	}

	// this section is to find the unique permutation of String
	public static void distinctcomb(char s[], int i, int n) {
		if (i == n) {
			if (!(nset.contains(String.copyValueOf(s)))) 
				;
			nset.add(String.copyValueOf(s));
			System.out.println(s)	;

		}
		
		else {
			for (int j = i; j <= n; j++) {
				char temp = s[i];
				s[i] = s[j];
				s[j] = temp;

				distinctcomb(s, i + 1, n);
				temp = s[i];
				s[i] = s[j];
				s[j] = temp;

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String inputStr = "aab";
		// permu(inputStr, "");

		System.out.println("this is for the distint string");

		char xch[] = { 'A', 'A', 'B' };
				//inputStr.toCharArray();
		distinctcomb(xch, 0, xch.length - 1);
	}

}
