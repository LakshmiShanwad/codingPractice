package codingpackage;


class A
{
	void methodOfA()
	{
		System.out.println(" you r in A class method");
		
	}
}
	class B 
	{
		public A methodOfB()
		{
			System.out.println(" in B class method ");
			return new A();
		}
	}
	
