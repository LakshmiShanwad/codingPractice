package stringCoding;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BackSpaceInString {

	static String newString(String S) {
		Stack<Character> q = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != '#') {
				q.push(S.charAt(i));
			} else if (!(q.isEmpty())) {
				q.pop();

			}

		}
		String ans = "";
		while (!q.isEmpty()) {
			ans += q.pop();
		}

		String finalAns = "";
		for (int i = ans.length()-1; i >=0; i--) {
			finalAns += ans.charAt(i);
		}

		return finalAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(newString("ab#c#D#3"));
		List<Integer> ls = new LinkedList<Integer>();
		/*System.out.println(newString("abc#d##c"));
		System.out.println(newString("######"));
		System.out.println(newString("a#bc#d##c"));
		System.out.println(newString("ab##c#d##c"));
		System.out.println(newString("abc#d##c"));
		System.out.println(newString("ab###c#d##c"));*/
		

	}

}
