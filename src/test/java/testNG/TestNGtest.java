package testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGtest {
	
	
//	@BeforeSuite
//	public void test1()
//	{
//	  WebDriverManager.chromedriver().setup();
//	  WebDriver driver = new ChromeDriver();
//	  driver.get("https://mvnrepository.com/search?q=selenium");
//	  
//	  driver.manage().window().maximize();
//	  System.out.println(driver.getTitle());
//	  driver.close();
//	}
//	@AfterSuite
//	public void test2()
//	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://kite.zerodha.com/dashboard");
//		  
//		driver.manage().window().maximize();
//		
//		System.out.println(driver.getTitle());
//		driver.quit();
//	}
	@BeforeTest
	public void test3()
	{
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void test4()
	{
		System.out.println("AfterTest");
	}
	
	@Test(threadPoolSize = 5,invocationCount = 10)
	public void test9() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/dashboard");
		  
		driver.manage().window().maximize();
		
		
		
		String s1="Kite - Zerodha's fast and elegant flagship trading platform";
		
		Assert.assertEquals(s1,driver.getTitle() );
	}
	@Test
	public void test10() 
	{
		System.out.println("Test10");
	}
	@BeforeClass
	public void test5()
	{
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void test6()
	{
		System.out.println("AfterClass");
	}
	@BeforeMethod
	public void test7()
	{
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void test8()
	{
		System.out.println("AfterMethod");
	}

}
