package codingpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//this program will contain an array and we have to find those number whose sum of digits are same and give maximum sum
public class SumOfNumequaltoSum {

	Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
	public int sum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}

	public Map<Integer, Integer> method(int In[]) {
		int a = 0;
		for(int i=0;i<In.length;i++)
		{
			 a = sum(In[i]);
			map.put(In[i], a);
		}
		return map;
	}
	
	public void method1(int In[])
	{
		for(int i=0;i<In.length;i++)
		{
			if(map.containsKey(In[i]))
			{
				int v = map.get(In[i]);
						
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumequaltoSum obj = new SumOfNumequaltoSum();
		int a[]= {51,71,17,42};
		System.out.println(obj.method(a));

	}

}
