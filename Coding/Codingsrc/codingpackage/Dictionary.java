package codingpackage;

public class Dictionary {
	static String s[] = { "ashutosh","Ashutosh","#ashutosh" ,"ashu"};

	public static void dic() {

		int count = s.length;
		String temp;
		for (int i = 0; i < count; i++) {
			for (int k = i + 1; k < count; k++) {
				if (s[i].toLowerCase().compareTo(s[k].toLowerCase()) > 0) {
					temp = s[i];
					s[i] = s[k];
					s[k] = temp;
				}

			}
		}
		for (int i = 0; i <= count - 1; i++) {
			System.out.print(s[i] + ", ");
		}
	}

	public static void main(String args[]) {
		dic();
	}

}