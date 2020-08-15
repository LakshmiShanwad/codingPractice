package stringCoding;

public class CamelCase {

	static int countwords(String s) {

		String[] t = s.split("(?=\\p{Upper})");

		for (int a = 0; a < t.length; a++)

		{
			System.out.println(t[a]);
		}
		return s.split("(?=\\p{Upper})").length;

	}

	public static void main(String[] args) {
		System.out.println("the total word return  " + countwords("saveThe"));

	}

}
