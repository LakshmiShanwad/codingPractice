package testPackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant {

	public void pairFinder() {

		// to find frequecies of any interger 

		int pairs = 0;
	
		List<Integer> lst = Arrays.asList(1, 1, 3, 1, 2, 2, 3, 3, 3, 2);
	
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		
		/*
		 * lst.stream().forEach(i -> { if (m.containsKey(i)) m.put(i, m.get(i) + 1);
		 * else m.put(i, 1); });
		 */

		for (int i : lst) {
			if (m.containsKey(i))
				m.put(i, m.get(i) + 1);
			else
				m.put(i, 1);
		}

		System.out.println("Status of the Map " + m);

		/*
		 * for (int i : m.keySet()) { pairs = pairs + m.get(i) / 2; }
		 */

		for (int i : m.values())
			pairs = pairs + i / 2;

		System.out.println("No. of pairs in the array: " + pairs);
	}

	public static void main(String[] args) {
		SockMerchant s = new SockMerchant();
		s.pairFinder();

	}

}
