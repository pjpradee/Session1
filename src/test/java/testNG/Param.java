package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Param 
{
	
	@Test
	@Parameters({"uname","pass"})
   public void getData(String uname,String pass) throws InterruptedException
 {
	 WebDriverManager.edgedriver().setup();
	 WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys(uname);
	
	driver.findElement(By.id("pass")).sendKeys(pass);
	Thread.sleep(5000);
//	driver.findElement(By.xpath("//button[@name='login']")).click();
	driver.close();
 }
}
