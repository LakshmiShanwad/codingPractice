package testPackage;

public class Zxy1 extends Zxy {

	public  static void m2() {
		System.out.println("you r in child method m2 of driver class");
		
	}

	public static void staticmeth() {
		System.out.println("implementing childclass method");

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zxy obj = new Zxy1();
		Zxy.staticmeth();
		Zxy1.staticmeth();
		

	}
}
