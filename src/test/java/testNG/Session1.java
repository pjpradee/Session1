package testNG;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Session1 

{  WebDriver driver;
        @BeforeSuite
        public   void url()	{
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']/../following-sibling ::div"));
		driver.manage().window().maximize();
		
		System.out.println("Lets Begin Evaluating the Test Cases");
		List<WebElement> ele1 =driver.findElements(By.xpath("(//div[@class='g tF2Cxc'or @class='hlcw0c']//h3[@class='LC20lb MBeuO DKV0Md'])[position()<6]"));
		for(WebElement w1 :ele1)
		{
			String s1 = w1.getText();
			System.out.println(s1);
		}
		
		}

	@Test(dependsOnMethods= {"test2"})
	public void test1()
{
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Walmart"+Keys.ENTER);
     System.out.println(driver.getTitle());
	 }
	@Test
	public void test2()
	{
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Vegetables"+Keys.ENTER);
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("test case 2 Passed");
	}
	@BeforeTest
	public void beforeMethod()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterMethod()
	{
		System.out.println("After Test");
		
		
	}
	@AfterMethod
	public void afterSuite()
	{
		System.out.println("All our test Cases has been Executed");
		driver.close();
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Classes got Finished");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Classes got Started");
	}
}
