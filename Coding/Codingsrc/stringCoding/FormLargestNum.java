package stringCoding;

import java.util.Arrays;
import java.util.Comparator;

public class FormLargestNum {

    //Find the largest number that can be formed in an integer array.
    //you can convert it to a string in order to avoid the length issue

    public static String formLargestNum(int[] num)
    {
        String[]str  = new String[num.length];
        for (int i=0;i<num.length;i++)
        {
            str[i]=Integer.toString(num[i]);
        }
        Arrays.sort(str,(a,b)->{
            long n1 = Long.parseLong(a+b);
            long n2 = Long.parseLong(b+a);
            if(n1>n2){
                return 1;
            }
            else if(n1<n2)
            {
                return -1;
            }
            else {
                return 0;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1;i>=0;i--)
        {
            sb.append(str[i]);
        }

        return sb.toString();
    }

    public static String secondApproach(int[] num)
    {
        String str[] = new String[num.length];
        for (int i=0;i<num.length;i++)
        {
            str[i]= Integer.toString(num[i]);
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String o1=a+b;
                String o2 =b+a;
                return o2.compareTo(o1);
            }

        });

        StringBuilder sb = new StringBuilder();
        for (String s : str)
        {
            sb.append(s);
        }
        return  sb.toString();
    }
    public static void main(String args[])
    {

        int nums[] ={22,3,31};
        System.out.println(formLargestNum(nums));
        System.out.println(secondApproach(nums));

    }
}
