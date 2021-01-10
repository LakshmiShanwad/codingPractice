package codingpackage;

//Given two array 
/*Array1={1111,2222,3333,4444}
Array2={2222,3333,4444,5555}

Required output:
matching = {2222,3333,4444}
Not matching from 1 {1111}
Not matching  from 2 {5555}
*/
public class Arrayrepeatvalue {

	static void method(int a[], int b[]) {
		int tempa1 = 0;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					tempa1 = a[i];
					flag = true;
					break;

				}

			}
			if (flag) {
				System.out.println("similar values " + tempa1);
				flag = false;
			} else {
				System.out.println("EXTRA IN A Array " + a[i]);
				flag = false;
			}

		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					// tempa1 = b[i];
					flag = true;
					break;

				}

			}
			if (flag) {
				// System.out.println("similar " + tempa1);
				flag = false;
			} else {
				System.out.println("EXTRA IN B Array " + b[i]);
				flag = false;
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1111, 2222, 3333, 4444, 6666 };
		int b[] = { 2222, 3333, 4444, 5555 };
		method(a, b);

	}

}
