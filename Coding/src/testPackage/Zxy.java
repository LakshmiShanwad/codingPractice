package testPackage;

import java.util.Arrays;

public class Zxy {

	static int a;
	int b = 10;

	int c[] = { 2, 3, 3, 4 };

	public int nonstaticmeth() {
		System.out.println("this is non static method using non static variable " + b);

		System.out.println(Arrays.binarySearch(c, 3));

		return b;

	}

	public static void staticmethod() {

		Zxy obj = new Zxy();
		System.out.println(obj.nonstaticmeth());
		System.out.println("this is direct access of non static in static method " + obj.b);
	}

	public static void main(String args[]) {
		staticmethod();
	}

}
