package practiceonly;

import java.util.ArrayList;
import java.util.List;

public class Class1 extends AbsTest implements Interface1 {

	int a5 = 10;

	List<Integer> list = new ArrayList<>();
	public int sum(int a[]) {

		int i = 0, j = 0;
		int sum = 0, diff = 0;
		int sind = 0;
		int nind = 0;

		for (i = 0; i < a.length; i++) {
			if (a[i] == 6) {
				sind = i;
				break;
			}
		}
		for (i = 0; i < a.length; i++) {
			if (a[i] == 9) {
				nind = i;

			}
		}

		if (sind > 0 && nind > 0) {
			for (j = sind; j <= nind; j++) {
				diff += a[j];
			}
		}
		for (i = 0; i < a.length; i++) {
			sum += a[i];
		}

		return sum - diff;

	}

	public void stringQuestion(String s) {
		int count = 0;
		s.toLowerCase();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'o') {
				count++;
			}

		}

	}

	void absmethod() {
		System.out.println("this is child class ");
	}

	public static void testmethood() {
		Class1 obj = new Class1();
		obj.a5 = 12;
	}

	private void method3() {
		// TODO Auto-generated method stub
		System.out.println(" this is new private method");

	}

	@Override
	public void method() {

		// TODO Auto-generated method stub
		//System.out.println(" this is the interface methods" + a1 + b);

	}

	void powermethod(int x, int y) {
		int powervalue = 1;
		for (int k = 1; k <= y; k++) {
			powervalue = powervalue * x;
		}
		System.out.println(" power " + powervalue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 6, 6, 7, 2,6,7, 9, 9, 8, 0 ,100};
		Class1 obj = new Class1();
		AbsTest absobj = new AbsTest();
		System.out.println("Objecct hascode: " + obj.hashCode()+ " SACSAC "+ absobj.hashCode() +" MAP " +  absobj.hmap.hashCode() );
		obj.powermethod(18,3);
		obj.absmethod();
		
		
		absobj.absmethod();
		
		obj.method();
		
		obj.a5=19;
		obj.method2();
		obj.method3();
		obj.absmethod();
		
		System.out.println(obj.sum(a));
		obj.stringQuestion("tomorrow");
	}
	
}
