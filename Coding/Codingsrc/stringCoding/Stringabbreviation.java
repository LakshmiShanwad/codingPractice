package stringCoding;

public class Stringabbreviation {

	public static void method1(String input)
	{
		//String s1[]=input.split(" ");
		for(int a =0;a<input.split(" ").length;a++)
		{
			char ch[] = input.split(" ")[a].toCharArray();
			System.out.print(ch[0]+".");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1("Ashutosh Kumar Singh");

	}

}
