package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionCross 
{  
	 WebDriver driver;

	 @Test(groups={"Session2"})
	  public void LaunchBrowser()
	{
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com");
	}
	 @Test
	 
	  public void getTitle()
	  {
        String title = driver.getTitle();
        System.out.println(title);
	  }
	 @Test(groups= {"Session1","Session2"})

	  public void getCurrenturl()
	  {
		 String URL= driver.getCurrentUrl();
		 System.out.println(URL);
	  }
  

}