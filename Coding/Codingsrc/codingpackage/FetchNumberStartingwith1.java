package codingpackage;

import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class FetchNumberStartingwith1 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(14);
        ls.add(26);
        ls.add(31);
        ls.add(14);
        ls.add(26);
        System.out.println(ls);
       // System.out.println(findNumberStartingwith1(ls));
        List<Integer> list = Arrays.asList(5,14,16,15,14,5,14);
        System.out.println(list+ "\n" + findduplicate(list));
        System.out.println(findduplicate(ls));
        System.out.println("Frequency "+ findFrequency(ls));
    }

    private static List findNumberStartingwith1(List<Integer> input) {
        return input.stream().filter(n -> String.valueOf(n).charAt(0) == '1').collect(Collectors.toList());

    }
    public static <T> Set<T> findduplicate(List<T> list)
    {
        return list.stream().filter(a-> Collections.frequency(list,a)>1).collect(Collectors.toSet());
    }

    private static ConcurrentMap<Integer, Integer> findFrequency(List<Integer> list)
    {
       // return list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.summarizingInt(e->1)));
        return list.parallelStream().collect(Collectors.toConcurrentMap(a->a,a->1, Integer::sum))
                ;
    }
}
