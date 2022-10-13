package codingpackage;



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

    // sort integer on basis of frequency

    public  static int[] mthd(int [] in)
    {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int out[] = new int[in.length];
        for (int a:in
             ) {
            hmap.put(a, hmap.getOrDefault(a,0)+1);

        }
        System.out.println(hmap);
        hmap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                forEach(record ->{
                    int key = record.getKey();
                    int value = record.getValue();
                    for (int b = 0 ;b<value;b++)
                    {
                        in[b]=key;
                    }

                });
        return out;
    }
    public static void main(String[] args) {
        System.out.println(sortString("aqgtfa"));
        int input[] = {2,4,4,1};
        System.out.println(mthd(new int[]{2,4,4,1}));
        for (int i=0;i<input.length;i++)
        {
            System.out.println(input[i]);
        }
    }
}
