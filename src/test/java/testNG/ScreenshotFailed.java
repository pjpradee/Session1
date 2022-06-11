package testNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotFailed 
{
   static WebDriver driver;
   @Test
   public static void CaptureScreen()
   {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.in/");
	   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	   
   }
   
   @AfterMethod
   
   public void screenShot(ITestResult result)
   {
	   if(ITestResult.FAILURE==result.getStatus())
	   {
		   try
		   {
			   TakesScreenshot tks=(TakesScreenshot)driver;
			   File src = tks.getScreenshotAs(OutputType.FILE);
			   FileUtils.copyFile(src,new File("C:\\Users\\HP\\eclipse-workspace\\Framework\\ScreenShot"+ result.getName()+".png"));
			   System.out.println("SucessFully Saved");
		   }
		   catch (Exception e)
		   {
			   System.out.println("Exception is"+ e.getMessage());
		   }
	   }
	   driver.close();
   }
}
