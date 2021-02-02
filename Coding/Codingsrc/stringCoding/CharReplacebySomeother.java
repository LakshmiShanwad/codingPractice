package stringCoding;

public class CharReplacebySomeother {

	// input s = "seleneum";
	// output s= "s@l@@n@@@um;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String temp = "@";
		String s = "seleneum";
		while (s.contains("e")) {
			s = s.substring(0, s.indexOf("e")) + temp + s.substring(s.indexOf("e") + 1);
			temp += "@";
		}
		System.out.println(" output string " + s);
	}

}
