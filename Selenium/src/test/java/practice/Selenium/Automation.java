package practice.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Automation {

	WebDriver driver;

	@Test
	public void browserTest() {ch.exe

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
