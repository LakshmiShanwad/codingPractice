package testPackage;

public class Jumpingcloud {

	public static int jumpcount() {

		int jump = 0;
		int i = 0;
		int a[] = { 0, 0 ,1 ,0, 0, 1, 0,1,0,0,0,0,0};
		//int a[] = { 0, 0 ,1 ,1};
		for (i = 0; i < a.length;) {
			/*if (a[0] == 1) {
				System.out.println("You die before the start");
				return 0;
			}*/
			/*if (a[a.length-1] == 1 && a[a.length-2] == 1 ) {
				System.out.println("You cannot finish the game");
				return i;
			}*/
			
			if (i+2 < a.length && a[i+2] == 0 ) {
				i = i + 2;
				jump++;
				continue;

			} else if (i+1 < a.length && a[i+1] == 0) {
				i = i + 1;
				jump++;
				continue;

			}
			i++;
		}
		return jump;
	}

	public static void main(String args[]) {
		System.out.println(jumpcount());
	}
}
