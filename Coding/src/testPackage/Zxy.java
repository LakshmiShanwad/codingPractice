package testPackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Zxy {

	String s = " Ashutish test ";
	int x = 010;
	int y = 0xfba;
	int resultedu= x+y;
	
	String[] fs= s.split(" ");
	static int a;
	static int b = 10;

	static int c[] = { 2, 3, 3, 4 };

	public static void staticmeth() {
		System.out.println("this is non static method using non static variable " + b);

		System.out.println("using array binary seach" + Arrays.binarySearch(c, 3));

	

	}

	public void stackmethod() {
		System.out.println(" edureka " + x +" " +  y + " "+ resultedu);
		Stack obj1 = new Stack<String>();
		obj1.push("ashutosh");
		obj1.push("kumar");
		obj1.push("singh");
		//System.out.println(obj1.pop());
		Iterator value = obj1.iterator(); 
		System.out.println("The iterator values IN REVERSE are: "); 
        while ((obj1.size())!=0) { 
            System.out.print(obj1.pop()+ " "); 
        } 

	
	}

	public static void staticmethod() {

		Zxy obj = new Zxy();
		obj.stackmethod();
		//System.out.println(obj.nonstaticmeth());
		//System.out.println("this is direct access of non static in static method " + obj.b);
	}

	public static void main(String args[]) {
		staticmethod();
	}

}
