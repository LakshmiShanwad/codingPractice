package ArrayProgram;

public class Segregate0and1 {

    public static void segregate(int arr[])
    {
        int left =0;
        int right =arr.length-1;

        while (left<right)
        {
            while (arr[left]==0 && left<right)
            {
                left++;
            }
            while (arr[right]==1 && left<right)
            {
                right--;
            }

            if(left<right)
            {
                arr[left]=0;
                arr[right]=1;
                left++;
                right--;
            }
        }
    }

    public static  void  segregate10(int arr[])
    {
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            while (arr[left]==1 && left<right)
            {
                left++;
            }
            while (arr[right]==0 && left<right)
            {
                right--;
            }
            if(left<right)
            {
                arr[left]=1;
                arr[right]=0;
                left++;
                right--;
            }
        }
    }


    public static void main(String[] args) {
        int[] input = {0,1,1,1,0,0,1,1,0,1};
        segregate(input);
        for (int i=0;i<input.length;i++)
        {
            System.out.print( input[i]+ "  ");
        }
        System.out.println("\n");

        segregate10(input);
        for (int i=0 ; i<input.length;i++)
        {
            System.out.print(input[i] + "  ");
        }
    }
}
