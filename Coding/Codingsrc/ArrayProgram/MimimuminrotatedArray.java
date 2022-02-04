package ArrayProgram;

public class MimimuminrotatedArray {
    // Find the minimum in rotated sorted array

    public static int findtarget(int[] array)
    {

        int low=0;
        int high= array.length-1;
        while (low<=high)
        {
            int mid = low+(high-low)/2;
            if(array[low]< array[mid])
            {
                if(array[mid-1]>array[mid] && array[mid]<array[mid+1])
                {
                    return array[mid];
                }
            }
            else if(array[mid]<array[high])
            {
                if(array[mid-1]>array[mid] && array[mid]<array[mid+1])
                {
                    return array[mid];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(findtarget(new int[]{4,5,2,3}));
    }
}
