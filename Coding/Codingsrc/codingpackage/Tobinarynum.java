package codingpackage;

public class Tobinarynum {

	public void returnbinary()
	{
		int n = 8;
		String s = Integer.toBinaryString(n);
		
		//from binary to decimal
		
		String binarynum = "1010";
		int  bintodeci = Integer.parseInt(binarynum, 2);
		System.out.println("<< the decimal of number binary is <>>>"+ bintodeci);
		
		System.out.println("<<  Input Binary number  >> "+ Integer.toBinaryString(n));
		char inic[]= s.toCharArray();
		int clength= inic.length;
		String sfinal="";
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			sfinal = sfinal+s.charAt(i);
			
			
		}
		System.out.println("character in reverse  >> "+ sfinal);
		if(s.charAt(0)==s.charAt(s.length()-1))
		{
			if(sfinal.equals(s))
				System.out.println("<<the binary is pallindrome>>");
			else 
				System.out.println("<<not pallindrome>>");
		}
		else 
			System.out.println("<<<No need to check pallindrome>>>");
		
		
	}
	
	public static void main(String args[])
	{
		Tobinarynum obj= new Tobinarynum();
		obj.returnbinary();
	}
}
