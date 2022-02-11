package stringCoding;

import java.util.HashSet;
import java.util.Set;

public class CountVowel {

    public static void countVowel(String str)
    {
        Set<Character> vset = new HashSet<>();
        int count=0;
        for (int i=0;i<str.length();i++)
        {
            vset.add(str.charAt(i));
        }
        if (vset.contains('a'))
        {
            count++;
        }
        if (vset.contains('e'))
        {
            count++;
        }  if (vset.contains('i'))
    {
        count++;
    }  if (vset.contains('o'))
    {
        count++;
    }  if (vset.contains('u'))
    {
        count++;
    }
        System.out.println(" Vowels are " + count);
        System.out.println( " Consonant are " + (Math.abs((vset.size()-count))));
    }

    public static void main(String[] args) {
        String input = "bcecea";
        countVowel(input);

    }
}
