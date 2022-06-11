package testNG;

import java.util.Map;
import java.util.TreeMap;

public class TreemapDemo
{
	public static void main(String []args)
	   {
		   Map<String,Integer> pradeep = new TreeMap<String,Integer>();
		   Map<String,Integer> vasanth = new TreeMap<String,Integer>();
		   
		   System.out.println("Pradeep Mark is as follows");
		    pradeep.put("Tamil", 86);
		    pradeep.put("Englih", 95);
		    pradeep.put("Maths", 100);
		    pradeep.put("Science", 99);
		    pradeep.put("Stock", 99);
		    pradeep.put("Stock", null);
		    pradeep.put("Gas Agency", null);
			pradeep.put("RocketScience", 96);
			
		    System.out.println(pradeep);
		    
		    System.out.println("Vasanth Mark is as follows");
		    
		    vasanth.put("Tamil", 86);
		    vasanth.put("Englih", 95);
		    vasanth.put("Maths", 100);
		    vasanth.put("Science", 99);
		    vasanth.put("Stock", 99);
		    vasanth.put("Stock", null);
		    vasanth.put("Gas Agency", null);
		    vasanth.put("RocketScience", 97);
		    
		    System.out.println(vasanth);
		    
		    
		    
    System.out.println(pradeep.equals(vasanth));
			
	   }
}
