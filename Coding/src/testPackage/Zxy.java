package testPackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Zxy {

	String s = " Ashutish test ";
	final int fvalue = 1;
	int x = 010;
	int y = 0xfba;
	int resultedu = x + y;

	String[] fs = s.split(" ");
	static int a;
	static int b = 10;

	static int c[] = { 2, 3, 3, 4 };

	public static void staticmeth() {
		System.out.println("this is non static method using non static variable " + b);

		System.out.println("using array binary seach" + Arrays.binarySearch(c, 3));

	}

	public static void newmethodcharrever(String s)

	{

		int j;
		String rev = " ";
		String spiltstring[] = s.split(" ");
		int splitstringlength = spiltstring.length;
		for (int i = splitstringlength - 1; i >= 0; i--) {

			String temp = " ";
			String stemp = spiltstring[i];
			char[] c = stemp.toCharArray();
			for (j = c.length - 1; j >= 0; j--) {
				System.out.print(c[j]);
				rev = rev + s.charAt(j);
			}

			System.out.print(" ");
			
			if (rev.equals(s)) {
				System.out.println(s + "this is the palindrome string");
			} else {
				System.out.println(" this is NOT");
			}

		}
	}

	public void stackmethod() {
		// System.out.println(" edureka " + x + " " + y + " " + resultedu);
		String a = "THIS IS NORMAL TECHINQUE";
		String spiltstring[] = a.split(" ");
		int splitstringlength = spiltstring.length;

		System.out.println(" printing the reversal of string using normal technique");
		for (int i = splitstringlength - 1; i >= 0; i--)

		{

			System.out.print(spiltstring[i] + " ");
		}

		System.out.println("");

	}

	@SuppressWarnings("unchecked")
	public static void usingStack()

	{
		Stack<String> obj1 = new Stack<String>();
		obj1.push("ashutosh");
		obj1.push("kumar");
		obj1.push("singh");
		// System.out.println(obj1.pop());
		@SuppressWarnings("rawtypes")
		Iterator value = obj1.iterator();
		System.out.println("The iterator values IN REVERSE using stack: ");

		while ((obj1.size()) != 0) {
			System.out.print(obj1.pop() + " ");
		}
	}

	public static void staticmethod() {

		Zxy obj = new Zxy();
		obj.stackmethod();
		// System.out.println(obj.nonstaticmeth());
		// System.out.println("this is direct access of non static in static method " +
		// obj.b);
	}

	public static void main(String args[]) {
		// staticmethod();
		// usingStack();
		newmethodcharrever("madam");
	}

}
