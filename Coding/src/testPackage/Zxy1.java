package testPackage;

public class Zxy1 extends Zxy {

	public void m2() {
		System.out.println("you r in child method m2");
	}
	public static void m1() {
		String s = "in static child class method";
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zxy ob = new Zxy();
		ob.m2();
		m1();

	}
}

