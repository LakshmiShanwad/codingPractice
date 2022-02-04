package stringCoding;

public class CountUpperLowerCase {

    public static void countLowerCase(String str)
    {
        int UpperCase=0;
        int LowerCase=0;
        String str1 = str.replaceAll("\\s","").trim();
        for(int i=0 ;i< str1.length();i++)
        {
            char ch = str1.charAt(i);
          /*  if(Character.isDigit(ch))
            {

            }*/
             if(Character.isUpperCase(ch))
            {
                UpperCase++;
                System.out.println(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                LowerCase++;
                System.out.println(ch);
            }


        }

        System.out.println("<<<< Upper case is>>> " + UpperCase + "  <<<<And Lower case is >>>> " + LowerCase);
    }


    public static void main(String[] args)
    {
        countLowerCase(new String("1lh*H"));
        countLowerCase(new String("*****++-/"));
        countLowerCase(new String("*****a///25/"));countLowerCase(new String(""));
        countLowerCase(new String("schahcag Aascacbascgas Aasgashcvasghassac ascgascbsyuacg*H"));


    }

}
