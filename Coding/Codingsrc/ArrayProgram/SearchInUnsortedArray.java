package ArrayProgram;

public class SearchInUnsortedArray {

    // this program will find the a value in unsorted array without doing sorting
    // time complexity will be O[n/2]

    public static String search(int[] a , int start, int end, int x)
    {
        while (start<=end)
        {
            if(a[start]==x || a[end]==x)
            {
                return "FOUND";
            }
            start++;
            end--;
        }
        return "NOT FOUND";
    }

    public static void main(String[] args) {
        int a[] ={8,2,56};
        System.out.println(search(a,0,a.length-1,56));

    }
}
