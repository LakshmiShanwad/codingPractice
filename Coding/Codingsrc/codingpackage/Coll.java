package codingpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//This is for the demo collection use

public final class Coll {

	Set<String> setobj = new HashSet<String>();
	List<String> listobj= new ArrayList<>();
	HashMap<Set , List> mapobj= new HashMap<>();
	HashMap<Integer , Integer> map= new HashMap<>();
	
	public void method1() {
		map.put(1, 10);
		map.put(2, 20);
		System.out.println("integer map iszr "+map.size());
		setobj.add("ashutosh");
		setobj.add("kumar");
		setobj.add("ashutosh1");
		
		listobj.addAll(setobj);
		listobj.add("ashutosh1");
		
		

		System.out.println(setobj.hashCode());
		
		if (setobj.isEmpty()) {
			System.out.println("the set is empty");
		}
		else
		{
			for(String str:setobj)
			System.out.println("the set is "+str);
		}
		System.out.println();
		System.out.println("now list");
		for(String str:listobj)
		{
			
			System.out.println(str);
		}
		
		System.out.println("now working on map");
		
		
		mapobj.put(setobj, listobj);
		System.out.println("map size "+mapobj.size());
		if(mapobj.containsValue("ashutosh"));
		System.out.println("true");
		
		for (Set str : mapobj.keySet())  
            System.out.println("key: " + str);
		
		
		for (List lstr : mapobj.values())  
            System.out.println("valuey: " + lstr);
		//System.out.println(mapobj.get(key));
		System.out.println(mapobj.entrySet());
		System.out.println("=====================================================");
		for(Entry e : mapobj.entrySet()) {
			System.out.println(e.getKey()+"==="+e.getValue());
			
		}
	}

	public static void main(String args[]) {
		Coll obj1 = new Coll();
		obj1.method1();
		int m = Integer.MIN_VALUE;
	}

}
