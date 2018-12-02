package gridDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest1 {

	WebDriver driver;
	String nodeUrl = "";

	@Test
	public void test1() throws MalformedURLException {
		nodeUrl = "http://192.168.28.1:4446/wd/hub";
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);

		driver = new RemoteWebDriver(new URL(nodeUrl), dc);

		driver.get("https://facebook.com/");
		System.out.println(driver.getTitle());

		driver.close();

	}

	@Test
	public void test2() throws MalformedURLException {
		nodeUrl = "http://192.168.28.1:4447/wd/hub";
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WIN10);

		driver = new RemoteWebDriver(new URL(nodeUrl), dc);

		driver.get("https://priceline.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
