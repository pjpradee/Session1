package testNG;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashmapDemo 
{
   public static void main(String []args)
   {
	   Map<String,Integer> m = new LinkedHashMap<String,Integer>();
	    m.put("Tamil", 86);
		m.put("Englih", 95);
		m.put("Maths", 100);
		m.put("Science", 99);
		m.put("Stock", 99);
		m.put("Stock", null);
		m.put("Gas Agency", null);
		m.put("Science", 96);
		
	    System.out.println(m);
		
   }
}
