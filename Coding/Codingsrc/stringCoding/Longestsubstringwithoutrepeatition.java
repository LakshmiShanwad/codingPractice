package stringCoding;


import java.util.HashSet;
import java.util.Set;

/*Leet code 3 , print the length of the longest substring without repeating character */
public class Longestsubstringwithoutrepeatition {

    public static int lengthoflongSubstring(String s)
    {
        int left =0 ,right =0,longSubstring=0;
        Set<Character> uniqueset = new HashSet<>();
        while (right<s.length())
        {
            if(!uniqueset.contains(s.charAt(right)))
            {
                uniqueset.add(s.charAt(right));
                right++;
                longSubstring=Math.max(longSubstring, uniqueset.size());
            }
            else
            {
                uniqueset.remove(s.charAt(left));
                left++;
            }

        }

        return  longSubstring;
    }

    public static void main(String[] args) {
        System.out.println(lengthoflongSubstring("abcb"));
    }
}
