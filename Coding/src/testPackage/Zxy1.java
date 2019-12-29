package testPackage;

public class Zxy1 extends Zxy {

	public  static void m2() {
		System.out.println("you r in child method m2");
	}

	public void m1() {
		System.out.println("implementing abstract class method m1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zxy1 obj = new Zxy1();
		obj.m2();
		obj.m1();
		

	}
}
