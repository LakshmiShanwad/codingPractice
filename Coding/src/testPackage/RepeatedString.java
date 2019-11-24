package testPackage;

public class RepeatedString {

	public static void rpeatString(String s, int n)

	{
		int len = s.length();
		char c[] = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--)
			System.out.print(c[i]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "' she sells seashels on the seashore '";
		System.out.println("after  trimming , the result is :");
		System.out.println(str.trim());
		// rpeatString("abc", 2);

	}

}
