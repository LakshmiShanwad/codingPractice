package practiceonly;

import java.util.HashMap;

/*
this will print the output as a2b3c1 for the input abacb
Means the frequency will also needs to be printed as per the input
 */
public class SortCharacterwithfrequency {

    public static void find(String str)
    {
        HashMap<Character,Integer> hashMap= new HashMap<>();
        for (Character c:str.toCharArray()
             ) {
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        System.out.println(hashMap);

    }

    public static void main(String[] args) {
        find("ababc");
    }
}
