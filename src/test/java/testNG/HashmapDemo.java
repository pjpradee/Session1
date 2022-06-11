package testNG;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo 
{

	public static void main(String []args)
	{
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		m.put("Tamil", 86);
		m.put("Englih", 95);
		m.put("Maths", 100);
		m.put("Science", 95);
		m.put("Stock", 99);
		m.put("Stock", null);
		m.put("Gas Agency", null);
		m.put("Science", 95);
		
		System.out.println(m);
		
		System.out.println(m.containsKey("Tamil"));
		System.out.println(m.containsValue(100));
		System.out.println(m.remove("Maths", 100));
		System.out.println(m);
		
		System.out.println(m.size());
//		How to iterate using Enhanced For Loop
		
		m.clear();
		m.put("Statistics",200);
		System.out.println(m);
		m.put("Tamil", 86);
		m.put("Englih", 95);
		m.put("Maths", 100);
		m.put("Science", 95);
		m.put("Stock", 99);
		m.put("Stock", null);
		m.put("Gas Agency", null);
		m.put("Science", 95);
		System.out.println(m);
//		How to iterate using Enhanced For Loop
		
		Set<Entry<String, Integer>> s1 = m.entrySet();
		for(Map.Entry<String,Integer> k:s1)
		{
			System.out.println("Keys in given entry set is " + k.getKey());
			System.out.println("Values in "+  k.getKey() + " is " + k.getValue());
			
		}
		
	Set<String> s2 = m.keySet();
	for(String k:s2)
	{
		System.out.println(k);
	}
		
	Collection<Integer> s3 = m.values();
	for(Integer k:s3)
	{
		System.out.println(k);
	}
		
	}
}
