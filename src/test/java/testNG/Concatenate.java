package testNG;

public class Concatenate 

{

	public static void main(String[]args)
	{
		String s1= "ABC";
		String s2= "AggC";
		String s3= "ABff";
		String s4= "AgffC";
		
		String str=s1.concat(s3.concat(s2).concat(s4));
		
//		String s5 = s1.concat(s2);
//		String s6 = s5.concat(s3);
//		String s7 = s6.concat(s4);
		
		System.out.println(str);
		
				
	}
}
