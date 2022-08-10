package codingpackage;

import org.jcodings.util.Hash;

import java.util.HashMap;
import java.util.Map;

public class SortStringonBasisofFrequency {

    public static String sortString(String str)
    {
        HashMap<Character,Integer> hmap = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (Character ch :
             str.toCharArray()) {
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);

        }
        System.out.println(" the hashmap is " +  hmap);

        hmap.entrySet().stream().sorted(Map.Entry.<Character,Integer>comparingByValue())
                .forEach(record -> {
                    Character key = record.getKey();
                    int value = record.getValue();
                    for (int i = 0; i < value ; i++) {
                        sb.append(key);
                    }
                });
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortString("qr141aarrr1qq"));
    }
}
