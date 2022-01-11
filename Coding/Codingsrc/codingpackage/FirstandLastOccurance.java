/**
 * 
 */
package codingpackage;

/**
 * @author ashutosh
 * Find the start and end index of any target in an sorted array
 * use binary search
 */
public class FirstandLastOccurance {

    public static int[] searchRange(int[] num, int target)
    {
        int[] ans= {-1,-1};
        ans[0]=search(num,target,true);
        ans[1]=search(num,target,false);
        return ans;

    }

    static int search(int a[],int target,boolean findStartIndex)
    {
        int ans =-1;
        int start =0;
        int end =a.length-1;
        while(start<=end)
        {
            int mid = start+((end-start)/2);
            if(target>a[mid])
            {
                start=mid+1;
            }
            else if(target<a[mid])
            {
                end = mid-1;
            }
            else
            {
                ans=mid;
                if(findStartIndex)
                {
                    end = mid-1;
                }
                else
                {
                    start=mid+1;
                }

            }

        }
        return ans;

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input[]= {5,7,7,8,8,10};
        int target=7;
        for (int i=0;i<searchRange(input,target).length;i++){
        System.out.println(searchRange(input,target)[i]);}





    }
}
