package codingpackage;

import java.util.*;

public class SortStringORINTonBasisofFrequency {

    public static void main(String[] args) {
        System.out.println(sortString("abaa"));
        Integer[] a = {510, 11474, 5827, 7, 7, 1};
        System.out.println(sortIntonBasisoffrequency(Arrays.asList('d','e','c','d')));
    }
    public static String sortString(String str) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (Character ch :
                str.toCharArray()) {
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }
        //System.out.println(" the hashmap is " + hmap);
        hmap.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue())
                .forEach(record -> {
                    Character key = record.getKey();
                    int value = record.getValue();
                    for (int i = 0; i < value; i++) {
                        sb.append(key);
                    }
                });
        return sb.reverse().toString();
    }
    // sort integer on basis of frequency

    /*
    this will sort the integer array on basis of frequency and for same frequency it will   
     */
    public static List<Character> sortIntonBasisoffrequency(List<Character> list) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char a : list
        ) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
            //System.out.println(hashMap);
        }
        System.out.println(hashMap);
        Collections.sort(list, (a, b) ->
        {
            int frequency1 = hashMap.get(a);
            int frequency2 = hashMap.get(b);
            if ((frequency1 != frequency2)) {
                return frequency2 - frequency1;
            } else {
                return (a - b);
            }
        });
        return list;
    }

}
