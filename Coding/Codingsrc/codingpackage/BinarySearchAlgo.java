package codingpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BinarySearchAlgo {

	// binary search is for the sorted array
	// find li hi and mi index then compare the value at mi index with to be
	// searched value and re adjuting the middle index again
	//

    static  int index = -1;

    public static int bSearch(int a[],int low,int high, int x)
    {

        while (low<=high)
        {
            int mid = low+((high-low)/2);
            if(x>a[mid]){
                low=mid+1;}
            else if(x<a[mid]){
                high=mid-1;}
            else if(x==a[mid])
            {
                index=mid;
                break;
            }


        }
        if(low> high){
            System.out.println(" element not found ");
        }
        return index;
    }
	public static void main(String args[]) {
		 int[] array = {5,10,156};
	        int low = 0 ;
	        int high = array.length-1;
	        int x =156;
	        System.out.println(bSearch(array,low,high,x));
		
	}
	
}
