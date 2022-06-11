package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextDemo 
{
	public static void main (String []args )
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/#loggedout");
		
		driver.manage().window().maximize();
		
		WebElement ele1 =driver.findElement(By.id("userid"));
		
		ele1.sendKeys("DU2680"+Keys.ENTER);
		
		WebElement ele2 =driver.findElement(By.id("password"));
		ele2.sendKeys("Pkgas@2020"+Keys.ENTER);
		
		WebElement ele5 =driver.findElement(By.xpath("//button[@type='submit']"));
		ele5.click();

		WebElement ele3 =driver.findElement(By.xpath("//input[@type='password']"));
		
		ele3.sendKeys("777777"+Keys.ENTER);
		
		WebElement ele4 =driver.findElement(By.xpath("//*[text()='Continue ']"));
		ele4.click();
		
		

		
		
		
		
		
		
		
		
	}

}
