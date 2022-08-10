package codingpackage;

public class QuickSort {
	// ascending order  by divide and conquer rule
	//choose a pivot point and compare with this pivot point and swap


	int partition(int a[], int low, int high) {
		int p = a[(low + high) / 2];
		while (low <= high) {

			while (a[low] < p) {
				low++;
			}

			while (a[high] > p) {
				high--;
			}
			if (low <= high) {
				int temp = a[low];

				a[low] = a[high];

				a[high] = temp;
				low++;
				high--;

			}
		}

		return low;

	}

	void quickSortRecursion(int a[], int low, int high) {
		int pi = partition(a, low, high);
		if (low < pi - 1) {// this is for left hand side of pivot
			quickSortRecursion(a, low, pi - 1);
		}
		if (high>pi) {// this is for right hand side list
			quickSortRecursion(a, pi, high);
		}
	}

	void printArray(int a[]) {
		int s = 0;
		for (int i : a) {
			s = s + i;
			System.out.print( i +  ",") ;

		}
		//System.out.println("Sum" + s);
	}

	
	int partitionDesc(int a[], int low, int high) {
		int p = a[(low + high) / 2];
		while (low <= high) {

			while (a[low] > p) {
				low++;
			}

			while (a[high] < p) {
				high--;
			}
			if (low <= high) {
				int temp = a[low];

				a[low] = a[high];

				a[high] = temp;
				low++;
				high--;

			}
		}

		return low;

	}

	void quickSortRecursionDesc(int a[], int low, int high) {
		int pi = partitionDesc(a, low, high);
		if (low < pi - 1) {// this is for left hand side of pivot
			quickSortRecursionDesc(a, low, pi - 1);
		}
		if (pi < high) {// this is for right hand side list
			quickSortRecursionDesc(a, pi, high);
		}
	}

	void printArrayDesc(int a[]) {
		int s = 0;
		for (int i : a) {
			s = s + i;
			System.out.print(" sorted array desc" + i);

		}
		System.out.println("Sumv desc" + s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 5, 1, 6 ,2};

		int len = a.length;
		QuickSort o = new QuickSort();

		o.quickSortRecursion(a, 0, len - 1);
		o.printArray(a);
		//o.quickSortRecursionDesc(a, 0, len-1);
		//o.printArrayDesc(a);

	}

}
