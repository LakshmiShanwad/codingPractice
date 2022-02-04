package stringCoding;

public class FetchNumersFromString {

	static int sum = 0;

	static int method(String str) {

		String s1 = str.replaceAll("[^0-9]", "").trim();
		System.out.println(s1);
		for (int i = 0; i < s1.length(); i++) {
			sum += Character.getNumericValue(s1.charAt(i));
		}
		return sum;

	}

	public static void main(String args[]) {
		System.out.println(" the sums is " + method("$124sk124"));
		String s= "ashhu";
		String s1=s+"tosdd";

	}

}
