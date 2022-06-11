package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionParameters
{    @Test
	 @Parameters({"email","pass"})
	 public void getData (String uname,String pass)
	 {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("email")).sendKeys(uname);
	     driver.findElement(By.id("pass")).sendKeys(pass);
//		 driver.findElement(By.name("login")).click();
		 driver.close();
	 }
}
