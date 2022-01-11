/**
 * 
 */
package codingpackage;

/**
 * @author ashutosh
 * to find out largest number greater smallest than the target number
 */
public class FloorNumber {
	static int index = Integer.MIN_VALUE;

    static int floorNum(int a[],int low , int high, int target)
    {
        while(low<=high)
        {
            int mid = low + ((high-low)/2);
            if(a[mid]>target)
            {
                high=mid-1;

            }
            else if(a[mid]< target)
            {
                low=mid+1;
            }
            else
            {
                return  mid;
            }

        }

        return high;
    }

    public  static  void main(String args[])
    {
        int arr[]={8,11,56};
        int low =0;
        int high = arr.length-1;
        int result =floorNum(arr,low,high,12);
        System.out.println(arr[result]);
    }

}
