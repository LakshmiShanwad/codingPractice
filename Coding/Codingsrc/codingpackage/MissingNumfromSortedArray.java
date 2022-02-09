package codingpackage;

public class MissingNumfromSortedArray {

	public static int missingNum(int array[] , int n)
	{
		int sumofNnumber = (n*(n+1))/2;
		int sumofavailableNumber = 0;
		for(int i=0;i<array.length;i++)
		{
			sumofavailableNumber+=array[i];
		}


		return sumofNnumber-sumofavailableNumber;
	}

	public static void main(String[] args) {
		int[] input = {8,7,1,2,4,3,5};
		System.out.println(missingNum(input,8));
	}

}
