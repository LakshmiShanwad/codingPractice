package practiceonly;

public interface Interface1 {
	public static int a1 = 10;
	final int b  =11;
	
	void method();
	
	default  void method2()
	{
		System.out.println(" this is the default methods");
		
	}
	
	static void method3()
	{
		System.out.println("thiss is the static interface methods");
	}

}
