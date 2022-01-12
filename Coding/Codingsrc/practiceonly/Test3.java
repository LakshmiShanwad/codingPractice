package practiceonly;

public class Test3 extends Test2


{

	public void methodofTest2()
	{
		System.out.println(" u r overriding methodofTest2 in Test3 class");
	}
	
	
	public static void main(String args[])
	{
		Test2 obj= new Test2();
		obj.methodofTest2();
		obj.method1ofTest2();
	}
	
}
