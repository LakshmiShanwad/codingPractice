package codingpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountWordsinString {

	// THIS IS FOR THE REPETATIVE WORDS
	public void countingstring(String s) {

		int pairs = 0;
		int triplet = 0;
		int single = 0;

		String spiltString[] = s.split(" ");

		List<String> Wlist = Arrays.asList(spiltString);

		Map<String, Integer> m = new HashMap<String, Integer>();

		for (String i : Wlist) {
			if (m.containsKey(i))
				m.put(i, m.get(i) + 1);
			else
				m.put(i, 1);
		}
		System.out.println("Status of the Map " + m);
		int maxvalue = Collections.max(m.values());

		String maxkeyset = Collections.max(m.keySet());

		System.out.println(maxkeyset + " => maximum key");
		System.out.println(maxvalue + " => maximum value");

		for (int i : m.values()) {
			if (i % 2 == 0)
				pairs++;

		}

		System.out.println("duble pairs is " + pairs);
		System.out.println("triplet " + triplet);

	}

	// THIS IS FOR THE REPETATIVE CHARACTER

	public void repChara(String s1) {

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
		Set<Character> keys = cHash.keySet();
		for (Character chars : keys) {
			if (cHash.get(chars) > 1) {

				System.out.println(chars + "-->> " + cHash.get(chars));
			}
		}

	}

	public void repeatCharLinkHM(String s1) {
		char c[] = s1.toCharArray();

		System.out.println("the length of word " + c.length);

		// List<char[]> lChar= Arrays.asList(c);
		Map<Character, Integer> cHash = new LinkedHashMap<Character, Integer>();

		for (Character ch : c) {
			if (cHash.containsKey(ch)) {
				cHash.put(ch, cHash.get(ch) + 1);

			} else
				cHash.put(ch, 1);

		}
		Set<Character> keys = cHash.keySet();
		for (Character chars : keys) {
			if (cHash.get(chars) == 1) {

				System.out.println(chars + "-->> " + cHash.get(chars));
				break;
			}
		}
		for (Character chars1 : keys) {
			if (cHash.get(chars1) > 1) {

				System.out.println("first repetative is >>  " + chars1 +  " -->> " + cHash.get(chars1));
				break;
			}
		}
	}

	public static void main(String args[]) {

		CountWordsinString obj = new CountWordsinString();

		obj.countingstring("Javav");
		obj.repChara("ASHUTOSH");
		obj.repeatCharLinkHM("javavsacyasgcysucvsaghcasjhasyhascgtjhasyccascaysci8iscyshjjcgsaggsdgsdvysgdsdhvsdjyvjhsdgjhsaagjyayysgjahsvjhasfgashashjcascgjashvhajshjasfhasfchjasfchjasvchjaschjsachajschascvhjasjhsachjasjhascjhjanbbnaghsachgsc nbasvhcs");
	}
}
