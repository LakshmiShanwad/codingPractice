package testPackage;

public class Valley {

	// this is for counting total valley

	public static int valleycount() {
		String s = "UDDDUDUU";
		char ch[] = s.toCharArray();

		int sealevel = 0;
		int valley = 0;
		int i = 0;

		for (char c : ch) {
			if (c == 'D') {
				sealevel--;

			} 
			else {
				sealevel++;
				if (sealevel == 0)
					//valley = valley + 1;
					valley+=1;
			}
		}
		return valley;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(valleycount());
	}

}
