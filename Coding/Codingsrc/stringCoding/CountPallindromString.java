package stringCoding;

public class CountPallindromString {

    public static int count(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            for (int j=i+1;j<str.length();j++)
            {
               if(ispallindrom(str.substring(i,j+1)))
                {
                    count++;
                }
            }
        }

            return  count;
    }

    public static boolean ispallindrom(String checkpallindrom)
    {
        String temp="";
        for (int i= checkpallindrom.length()-1;i>=0;i--)
        {
           temp+=checkpallindrom.charAt(i);

        }

        if(temp.equalsIgnoreCase(checkpallindrom))
        {
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        {
            System.out.println(count("abbaeae")); ///4
            System.out.println(count("abaab")); //3
            //
        }
    }
}
