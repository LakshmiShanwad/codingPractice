package testPackage;

public class CharrepateUller {

	public static void findcharindex(int index, String str) {
		StringBuffer temp = null;
		int len = str.length();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i + 1; j++)
			{
				temp = sb.append(str.charAt(i));

			}

		}
		System.out.println(temp);
		System.out.print(" character at index >> " + index);
		System.out.println(" is " + temp.charAt(index-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		findcharindex(1, s);

	}

}
