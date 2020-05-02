package codingpackage;

public class CatsMouse {

	public static String catandMouse(int x, int y, int z) {

		if (Math.abs(x - z) == Math.abs(y - z)) {
			return "mouse escape";

		}

		if (Math.abs(x - z) > Math.abs(y - z))
			return "CAT B";
		else
			return "CAT A";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(catandMouse(10,11,19));

	}

}
