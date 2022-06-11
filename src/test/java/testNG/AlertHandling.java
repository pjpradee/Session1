package testNG;



import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling 

{
	static WebDriver driver;
	
   public static void main (String []args ) throws Exception
   {
	   WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	   driver.navigate().to("https://www.softwaretestinghelp.com/essentials-of-java-in-selenium/");
	   String s1 = driver.getTitle();
	   System.out.println(s1);
	   driver.manage().window().maximize();
	   
	   TakesScreenshot tks=(TakesScreenshot)driver;
	   File src =tks.getScreenshotAs(OutputType.FILE);
	   
	   
	 
	   driver.close();
	 
	   
	  
   }
}
