package testBase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBase {
	
	public WebDriver driver;
	
	Properties prop = new Properties();
	
	@Test
	public void Test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\creat\\git\\ArifDhrubaPractice\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		
		driver.get("https://facebook.com/");
		System.out.println("Title of the page is: "+driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234abc");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	
		
	}

}
