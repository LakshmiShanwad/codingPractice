package stringCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringFrequencyCount {
	HashMap<Character, Integer> hash = new HashMap<>();

	void freqchar(String s) {
		char ch[] = s.replaceAll("\\s+", "").toCharArray();

		if (ch.length == 0) {
			System.out.println(" string is empty ");
		}
	
		else {
			for (char eachCharacter : ch) {
				if (hash.containsKey(eachCharacter)) {
					hash.put(eachCharacter, hash.get(eachCharacter) + 1);
				} else {
					hash.put(eachCharacter, 1);
				}
			}

			int maxcount = 0;
			char maxChar = 0;
			for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
				if (entry.getValue() > maxcount) {
					maxcount = entry.getValue();
					maxChar = entry.getKey();

				}
				System.out.println("set" + entry);
			}
	
			System.out.println(maxChar + " frequency  " + maxcount);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1, 2, 4, 5, 6);
		int a[] = { 3, 6, 8, 9, 21 };
		StringFrequencyCount obj = new StringFrequencyCount();
		obj.freqchar("my name is ashutosh");
	}

}
