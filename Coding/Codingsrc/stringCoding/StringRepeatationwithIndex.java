package stringCoding;

import java.awt.event.TextEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringRepeatationwithIndex {

	/*
	 * Input: "abcd" Output: "A-Bb-Ccc-Dddd"
	 */

	static void method(String inp) {
		int count = 0;
		String fString = "", temp = " ";
		for (int i = 0; i < inp.length(); i++) {
			count = i + 1;
			while (count-- > 0) {
				 
				fString += inp.charAt(i) +"-";

				
			}

		}
		System.out.println(fString.toUpperCase());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method("abcd");

	}

}
