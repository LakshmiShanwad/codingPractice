package Coding.Codingsrc.stringCoding;

import java.util.regex.Pattern;

public class FindFrequencyofParticularWord {
    public static void main(String[] args) {
        System.out.println(findFreqofParticularWord("pythonprogrammingjavaprogramming", "programming"));
        System.out.println(findFreqofParticularWord("abcabdab", "ab"));
        System.out.println(findFreqofParticularWord("applehasmanyapp", "app"));
        System.out.println(findFreqofParticularWord("appap", "ds"));

        System.out.println("\n");
        System.out.println(usingMatcherClass("pythonprogrammingjavaprogramming","program"));
        System.out.println(usingMatcherClass("abcabdab","ab"));
        System.out.println(usingMatcherClass("applehasmanyapp","app"));
        System.out.println(usingMatcherClass("appap","ds"));
    }

    private static long findFreqofParticularWord(String inputString, String wordTofind) {
        int left = 0, count = 0;
        int right = wordTofind.length();
        while (right <= inputString.length()) {
            if (inputString.substring(left, right).equalsIgnoreCase(wordTofind)) {
                count++;
            }
            left++;
            right++;
        }
        if (count==0)
        {
            return -1;
        }
        return count;

    }

    private static long usingMatcherClass(String inputString, String wordToFind)
    {
        return Pattern.compile(wordToFind).matcher(inputString).results().count();
    }
}
