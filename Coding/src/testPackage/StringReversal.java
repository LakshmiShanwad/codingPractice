package testPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReversal {

	static String s;

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String s = "madam";
		char[] revchar = s.toCharArray();
		for (int i=0;i<revchar.length;i++)
		System.out.print(revchar[i]);
		System.out.println("\n");
	
		String[] st = s.split(" ");

		for (String str : st) {
			char[] charstr = str.toCharArray();
			for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
				char temp;
				temp = charstr[i];
				charstr[i] = charstr[j];
				charstr[j] = temp;
			}
			System.out.print(charstr);
			System.out.print(" ");
		}

		}

	}
