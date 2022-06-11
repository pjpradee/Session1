package testNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotDemo 
{
  public static void main(String [] args) throws Exception
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  
//	  WebElement ele1=driver.findElement(By.xpath("//div//a[text()='Login']"));
//	  ele1.click();
      
	  WebElement ele2 = driver.findElement(By.xpath("//div[@class='_2Sn47c']//following-sibling::div[1]//preceding-sibling::div[2]//input[@type='text']"));
	  ele2.sendKeys("8883221888");
	  
	  WebElement ele3=driver.findElement(By.xpath("//div[@class='_2Sn47c' or @class='IiD88i _351hSN']//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	  ele3.sendKeys("pjp@1994");
	  
      WebElement ele4= driver.findElement(By.xpath("//div[@class='_2Sn47c']//following-sibling::div[3]//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	  
	  ele4.click();
	  
	  
	  
	  Thread.sleep(5000);
	  
	  TakesScreenshot tks= (TakesScreenshot)driver;
	  
	  File actual = tks.getScreenshotAs(OutputType.FILE);
	  
	  File screen = new File("C:\\Users\\HP\\eclipse-workspace\\Framework\\ScreenShot\\Flipkartproof.png");
	  
	  FileUtils.copyFile(actual, screen);
	 
	  
	 
	  
	  
  }
}
