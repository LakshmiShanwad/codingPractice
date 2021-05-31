package practiceonly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Dt extends Ds {

	public static boolean method(int a[]) {
		int net = 0, i = 0, x = 0, y = 0, z = 0;

		for (i = 0; i < a.length; i++) {

			if (a[i] == 0) {
				x = i;
				break;
			}
		}

		for (int j = x + 1; j < a.length; j++) {
			if (a[j] == 0) {
				y = j;
				break;
			}
		}
		for (int k = y + 1; k < a.length; k++) {
			if (a[k] == 7) {
				z = k;
				//i = k;
				break;
			}

		}

		if ((x < y) && (y < z) && (x < z)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {

		List<Integer> ls = new ArrayList();
		ls.add(1);
		ls.add(3);
		ls.add(4);
		int a[] = { 1, 0, 2, 0, 3, 7 };
		Collections.sort(ls);
		System.out.println(method(a));

	}

}
