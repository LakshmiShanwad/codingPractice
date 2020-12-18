package practiceonly;

public class tets {
	
	static void smallestNumber(int N)
	{
	   int a =(int) ((N % 9 + 1) * 
	            Math.pow(10, (N / 9)) - 1);
	   System.out.println(a);
	}
	  
	// Driver code
	public static void main(String[] args)
	{
	    int N = 10;
	    smallestNumber(N);
	}

}
