package practiceonly;

public class Test3 extends Test4 implements Interface1 , Runnable

{

	@Override
	public void Imethod1() {
		System.out.println(" overriding Imethod1 in Test3 " + a);

	}

	@Override
	public void Ameth1() {
		System.out.println(" overriding the abstract method meth1");

	}

	public static void main(String args[]) {
		Interface1 o3 = new Test3();
		Test4 o4 = new Test3();
		o3.Imethod1();
		o3.Imethod4();
		Interface1.Imethod3();
		
		Test4.Amethod2();
		o4.Ameth1();

	}

	@Override
	public void run() {
		
	}
}
