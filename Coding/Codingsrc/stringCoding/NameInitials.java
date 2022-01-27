package stringCoding;

import java.util.Locale;

public class NameInitials {

    public static String nameInit(String str) {
        if(str.length()==1)
        {
            return str.toUpperCase()+".";
        }
        String temp[] = str.split(" ");

        String tAns = "";
        for (int i = 0; i < temp.length; i++) {
             tAns+= temp[i].toUpperCase().charAt(0) + ".";
        }
        return tAns;
    }

    public static void main(String args[])
    {
        System.out.println(nameInit(new String("Ashutosh Barnwal")));

    }
}
