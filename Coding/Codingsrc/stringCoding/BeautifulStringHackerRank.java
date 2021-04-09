package stringCoding;

public class BeautifulStringHackerRank {

	static void solution(String s) {
		int flag = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == '1') {
				if (i > 0) {
					if (ch[i - 1] == '0' && ch[i + 1] == '0') {
						flag++;
					}
				}
			}

		}
		System.out.println(flag-1);
	}

	public static void main(String ar[]) {
		BeautifulStringHackerRank.solution("010001010");

	}

}
