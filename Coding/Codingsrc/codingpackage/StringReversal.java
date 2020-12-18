package codingpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReversal {
	
	//this is general  

	public static void normalreversal(String s)
	{
		char[] revchar = s.toCharArray();
		int len = revchar.length;
		for (int i = len-1; i >=0; i--)
			System.out.print(revchar[i]);
		System.out.println("\n");

	}

	public static void genericreversal(String s) {
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

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// THIS IS ADDED THROUGH GITHUB

		// genericreversal("ashu tosh kumar");
	
		genericreversal("ashu tosh  kumar singh");
		System.out.println("\n");
		normalreversal("ashu tosh");

	}

}
