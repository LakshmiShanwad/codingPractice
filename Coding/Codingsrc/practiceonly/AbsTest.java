package practiceonly;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public  class AbsTest {

	String a;
	List <Integer> a1 = new LinkedList<>();
	Set<Integer> hset = new HashSet<>();
	Map<String,Integer> hmap = new HashMap<String,Integer>();
	 void absmethod()
	 {
		 hset.add(1);
		 hset.add(2);
		 hset.add(1);
		 System.out.println(hset);
		 System.out.println("this is absmethod");
		 
		 hmap.put("a",1);
		 hmap.put("b", 2);
		 hmap.put("a", 3);
		 System.out.println(" HashMap "+ hmap);
	 }
	
}
