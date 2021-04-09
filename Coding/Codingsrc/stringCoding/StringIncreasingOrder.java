package stringCoding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringIncreasingOrder {

	static List<Integer> arrayList = new ArrayList<Integer>();

	static void runMethod(String inputString) {
		String splitString[] = inputString.split(" ");
		for (int k = 0; k < splitString.length; k++) {
			int len = splitString[k].toCharArray().length;
			;
			arrayList.add(len);

		}
		Collections.sort(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(splitString[arrayList.get(i)]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		runMethod("This is New");

	}

}
