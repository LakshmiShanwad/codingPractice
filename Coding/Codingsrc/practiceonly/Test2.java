package practiceonly;

import java.lang.reflect.Array;
import java.util.*;

import javax.swing.text.AbstractDocument.LeafElement;

public class Test2 {

	static int search(int ar[], int size)

	{
		int i = 0;
		while (i < size) {
			try {
				if ((ar[i + 1] - ar[i]) > 1) {

					return (ar[i] + 1);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;

		}
		
		return -1;

	}

	public static void main(String args[]) {
		int ar[] = { 1, 2, 3, 4, 5 };
		int size = ar.length;

		System.out.println(search(ar, size));
	}
}