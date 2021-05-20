package codingpackage;

public class JamesBond {

	public static boolean solution(int arr[]) {
		int x = 0, y = 0, z = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				x = i;
				break;

			}
		}
		for (int j = x + 1; j < arr.length; j++) {
			if (arr[j] == 0) {
				y = j;
				break;

			}
		}

		for (int k = y + 1; k < arr.length; k++) {

			if (arr[k] == 7) {
				z = k;
				break;
			}
		}

		if ((x < y) && (x < z) && (y < z))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[] = { 0, 8, 1, 0, 0, 7, 0, 7, 9, 0, 8, 0, 0, 7 };
		// int arr[] = { 0, 8, 1, 0, 0, 7, 0, 7, 9, 0, 8, 0, 0, 7 };
		int arr[] = { 0, 0, 0 };
		System.out.println(solution(arr));
	}

}
