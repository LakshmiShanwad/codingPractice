package codingpackage;


import org.apache.commons.collections.map.HashedMap;

import java.util.*;

/*
Find the repeated char , first repeated char and maximum repeated char
*/
public class FrequenyMap {

    public static Map<Character, Integer> freqMap = new HashMap<>();
    public static HashMap<Character,Integer> freqMap(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println(" the Map is " + freqMap);
        return (HashMap<Character, Integer>) freqMap;
    }

    public static  void repeatedChar(String str)
    {
            for(Map.Entry<Character,Integer> entry: freqMap(str).entrySet())
        {
            System.out.println(" the Key " + entry.getKey() + " repeated " + entry.getValue() + " times");
        }

    }

    public  static void maxRepeatedChar(String str)
    {

        int maxCount=0;
        char maxChar = 0;
        for (Map.Entry<Character,Integer> entry: freqMap.entrySet()
             ) {
            if(entry.getValue()>maxCount)
            {
                maxCount= entry.getValue();
                maxChar=entry.getKey();

            }
        }
        System.out.println(" the maximum times repeated character in an string is " + maxChar + " repeated "  + maxCount);

    }

    public static char firstTimerepeatedchar(String  str)
    {
        Set<Character> set = new HashSet<>();

        for (int i=0;i< str.length();i++)
        {
            char ch = str.charAt(i);
            if(!set.contains(ch))
            {
                set.add(ch);
            }
            else {
                return  ch;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String inputString = "abcbb";
        repeatedChar(inputString);
        maxRepeatedChar(inputString);

        System.out.println( " the first repeatedCharacter is " + firstTimerepeatedchar(inputString));
    }

}
