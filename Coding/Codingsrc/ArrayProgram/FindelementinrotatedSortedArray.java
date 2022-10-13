package ArrayProgram;

public class FindelementinrotatedSortedArray {

    //leet code 33

    public static int search(int nums[], int target)
    {
        int low =0;
        int high = nums.length-1;
        while (low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[low]<nums[mid])
            {
                if(target>nums[low] && target< nums[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low =mid+1;
                }
            }
            else if(nums[mid] < nums[high])
            {
                if(target>nums[mid] && target<=nums[high])
                {
                    low = mid+1;
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
       // System.out.println(search(new int[]{4,5,6,1,2}, 2));

        System.out.println(search(new int[]{1,2,8,9,10}, 2));
    }
}
