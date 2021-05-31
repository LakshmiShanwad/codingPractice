package codingpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BinarySearchAlgo {

	// binary search is for the sorted array
	// find li hi and mi index then compare the value at mi index with to be
	// searched value and re adjuting the middle index again
	//

	public static void main(String args[]) {
		Set<String> a1 = new HashSet<String>();
		int a11[] = { 6, 7, 341, 21, 3 };
		Arrays.sort(a11);
		for (int b : a11)
			System.out.println(b);
		int a[] = { 1, 11, 12 };
		// int a[]= {12,11,10,9,8,7,6,5};

		int sr = 12;
		int li = 0, hi = a.length - 1;
		int mi = (li + hi) / 2;

		while (li <= hi) {
			if (a[mi] == sr) {
				System.out.println(" element found at index " + li);
				break;
			} else if (a[mi] < sr) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}

		if (li > hi) {
			System.out.println(" element not found");
		}

	}

}
