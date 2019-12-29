package testPackage;

public abstract class Zxy {
	
	static String a; 

 public  abstract  void m1();

	public static void m2() {

		a= "this is static variable in abstract class using m2 method";
		System.out.println(" this is the m2 abstract method" +a);
	}
	static
	{
		a= "this is a static variable";
		System.out.println(" this is just a static block in abstrac class" + a);
	}

	
}
