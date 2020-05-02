package codingpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Countrepeatedobj {

	public void repeatobj() {

		System.out.println("<<<this wil print repeated numbers only>>>");
		int array[] = { 1, 2, 3, 4, 5, 6, 1, 2, };

		HashMap<Integer, Integer> hash1 = new HashMap<>();

		for (int i : array) {
			if (hash1.containsKey(i))

				hash1.put(i, hash1.get(i) + 1);
			else
				hash1.put(i, 1);

		}
		System.out.println(" THE NUMBERS ARE WITH FREQUENCY " + hash1);
		Set<Integer> keys = hash1.keySet();
		for (int i : keys) {
			if (hash1.get(i) > 1) {
				System.out.println(" repeated number " + i);
			}
		}
	}

	public void repeatobj(String s1) {
		System.out.println("<<<this wil print repeaed character >>>");

		char c[] = s1.toCharArray();

		System.out.println("the length of word " + c.length);

		// List<char[]> lChar= Arrays.asList(c);
		HashMap<Character, Integer> cHash = new HashMap<Character, Integer>();

		for (Character ch : c) {
			if (cHash.containsKey(ch)) {
				cHash.put(ch, cHash.get(ch) + 1);

			} else
				cHash.put(ch, 1);

		}

		System.out.println(" THE chararcters ARE WITH FREQUENCY " + cHash);
		Set<Character> keys = cHash.keySet();
		for (Character chars : keys) {
			if (cHash.get(chars) > 1) {

				System.out.println(chars + "-->> " + cHash.get(chars));
			}
		}
	}

	public void repeatobj(List inputsentence) {

		List<String> wlist1 = new ArrayList<String>();
		wlist1.addAll(inputsentence);

		Map<String, Integer> m = new HashMap<String, Integer>();

		for (String i : wlist1) {
			if (m.containsKey(i))
				m.put(i, m.get(i) + 1);
			else
				m.put(i, 1);
		}
		System.out.println("Status of the Map " + m);

		Set<String> keys = m.keySet();
		for (String s : keys) {
			if (m.get(s) > 1) {

				System.out.println("<<< repeated words >>> " + s);
			}
		}

	}

	public static void main(String args[]) {

		Countrepeatedobj obj = new Countrepeatedobj();
		obj.repeatobj();

		obj.repeatobj("ashutosh");

		String s = "you myself my and me and you";
		String s1 = "May God bless me and my friend and not me and me only you are my only friend";
		// char chars[] = s1.toCharArray();
		String spiltString[] = s1.split(" ");

		List<String> Wlist = Arrays.asList(spiltString);

		obj.repeatobj(Wlist);

	}

}
