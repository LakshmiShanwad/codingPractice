package testPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

// this is for the FInding the repeated Integer 

public class FirstRepeatedInteger {

	

	static Set<Integer> setobj = new HashSet<>();

	public static void meth(int a[], int b )

	{
		for (int i = 0; i <= a.length-1; i++) {
			if (setobj.contains(a[i]))
				b = a.length-i+1;
			else
				setobj.add(a[i]);

		}
		if (b !=-1)
			System.out.println("the first repeated character >>>>" + a[b]);
		else
			System.out.println("there is no repeated character >>");
	}

	public static void main(String args[]) {
		int a[]= {-1,-1,2,2,-1, 3, 4, 5, 4};
		meth(a ,-1);
	}

}
