package testNG;

import java.util.Scanner;

public class ListDemo
{
  
	
 public static void main ( String []args )
{
	Scanner s = new Scanner (System.in);
	
	int sev =s.nextInt();
	
	if(sev>0)
	{
		System.out.println("Entered Number is" + sev +  "Positive");
	}
	else {
		System.out.println("Entered Number is" + sev +  "Negative");
	}
	
	
 
}
}
