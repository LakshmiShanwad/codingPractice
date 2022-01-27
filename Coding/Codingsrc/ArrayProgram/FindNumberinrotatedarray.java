package ArrayProgram;

public class FindNumberinrotatedarray {

/*    search the number's index in an circular array'
* {4,5,6,7,1,2}; leet code 33
* */

    public static  int searchNumber(int[] arr,int target)
    {
        int low = 0;
        int high= arr.length-1;
        while (low<=high)  //{4,5,6,7,1,2};
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[low]<arr[mid])
            {
                if(target<arr[mid] && target>=arr[low])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else if(arr[mid]<arr[high])
            {
                if(target>arr[mid] && target< arr[high])
                {
                    low =mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int array[] ={2,5,6,0,0,1,2};
        int tar= 0;

        System.out.println(searchNumber(array,tar));

    }
}
