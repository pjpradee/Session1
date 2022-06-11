package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateDemo 
{
  public static void main (String []args ) throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  
	  driver.get("https://www.google.co.in/");
	  driver.findElement(By.name("q")).sendKeys("Zerodha"+Keys.ENTER);
	List <WebElement> L1  =driver.findElements(By.xpath("//div[@class='hlcw0c' or @class='g tF2Cxc']//div[@class='yuRUbf']//h3[@class='LC20lb MBeuO DKV0Md']"));
	  for(WebElement WebElement :L1)
	  {
		  System.out.println(WebElement.getText());
	  }
	  
	  
	  
	  
	  
	  
	  
	 
	  
	  
	  driver.manage().window().maximize();
	 
	  driver.close();
	  
	  
	  
	  driver.navigate().to("https://opstra.definedge.com/");
	  driver.manage().window().maximize();
	  driver.close();
	  Thread.sleep(3000);
	  
	  
	  driver.navigate().to("https://www.amazon.in/");
	  
	  
	  
	  Thread.sleep(5000);
	  
	  driver.navigate().back();
	  
	  Thread.sleep(3000);
	  
	  driver.navigate().refresh();
	  
	  Thread.sleep(3000);
	  
	  driver.navigate().forward();
	  
	  Thread.sleep(3000);
	  
	  driver.close();
	  
//     TakesScreenshot tks=(TakesScreenshot)driver;
//	  
//	  File temp=tks.getScreenshotAs(OutputType.FILE);
//	  
//	  File perm= new File("C:\\Users\\HP\\eclipse-workspace\\Framework\\ScreenShot\\Flipkartproof.png");
//	  
//	  FileUtils.copyFile(temp, perm);
	  
	  
	  
	  
	  
  }
}