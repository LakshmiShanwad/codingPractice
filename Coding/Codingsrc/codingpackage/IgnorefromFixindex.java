package codingpackage;

 
public class IgnorefromFixindex {

	// sum all by ignoring only 6 between 9th
	static void method(int a[]) {
		int i = 0, j, k, sum = 0;
		while (i < a.length) {
			if (a[i] == 6) {
				j = 1;
				k = i;
				while (a[k] != 9 && k < a.length) {
					k++;
					j++;

				}
				i = i + j;
			} else {
				sum = sum + a[i];
				i++;
			}

		}
		System.out.println("Sum " + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 6, 7, 9, 1, 6, 3, 9, 10 };

		method(a);
		

	}

}
