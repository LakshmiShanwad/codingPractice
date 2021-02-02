package codingpackage;

public class ReverseNumber {

	static int reverseNumber(int n )
	{
		int a = 1234;
		int rev=0;
	
		while(a!=0)
		{
			int r= a%10;
			rev= rev*10 + r;
			a=a/10;
			
			
		}
		return rev;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" rec "+ reverseNumber(-1234));
	}

}
