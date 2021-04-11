package codingpackage;

public class QuickSort {

	static int partition(int a[],int low , int high) 
	{
		int p = a[(low+high)/2];
		while(low<=high)
		{
			int b = a[low];
			while(a[low]<p)
			{
				low++;
			}
			int c = a[high];
			while(a[high]>p)
			{
				high--;
			}
			if(low<=high)
			{
				int temp = a[low];
				int x=a[low];
				a[low]= a[high];
				int y=a[high];
				a[high]= temp;
				low++;
				high--;
				
			}
		}
		

		return low;
		
	}
	static void quickSortRecursion(int a[],int low , int high)
	{
		int pi = partition(a, low, high);
		if(low<pi-1)
		{//this is for left hand side of pivot
			quickSortRecursion(a, low, pi-1);
		}
		if(pi<high)
		{// this is for right hand side list
			quickSortRecursion(a, pi+1, high);
		}
	}
	
	static void printArray(int a[])
	{
		for(int i:a)
		{
			System.out.println(" sorted array " + a[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 45, 14, 15, 9, 4, 67, 2};

		int len = a.length;
		quickSortRecursion(a, 0, len-1);
		printArray(a);

	}

}
