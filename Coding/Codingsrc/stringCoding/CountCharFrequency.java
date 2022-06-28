package stringCoding;

// Input abcdabcd . output a2b2c2d2

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountCharFrequency {


    public static String countCharacter(String str)
    {

        Map<Character, Integer> hm = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        if(str.length()<2)
        {
            sb.append(str).append(1);
            return sb.toString();
        }
        for (Character ch : str.toCharArray()
             ) {
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        Set<Character> st = hm.keySet();
        for (Character ch: st
             ) {
            sb.append(ch).append(hm.get(ch));

        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println("Required output is " + "\n" + countCharacter("aa"));
    }
}
