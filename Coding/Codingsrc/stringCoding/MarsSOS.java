package stringCoding;

public class MarsSOS {

	public static int sosMessage(String s) {
		int count = 0;
		char actualmsg[] = s.toCharArray();
		StringBuffer sb = new StringBuffer("SOS");
		int length = s.length();
		char expmsg[] = null;
		int i = 0;
		int repeat = length / 3 - 1;

		if (repeat > 0) {
			for (i = 0; i < repeat; i++) {
				expmsg = sb.append("SOS").toString().toCharArray();
			}

			for (i = 0; i < actualmsg.length; i++) {
				if (!(actualmsg[i] == expmsg[i])) {
					count++;
				}
			}

			System.out.println(count);
		} else {

			char c1[] = sb.toString().toCharArray();
			for (i = 0; i < actualmsg.length; i++) {
				if (!(actualmsg[i] == c1[i])) {
					count++;
				}
			}
			System.out.println(count);

		}
		return count;

	}

	public static void main(String[] args) {

		sosMessage("SOTSOTSOTSOO");

	}

}
