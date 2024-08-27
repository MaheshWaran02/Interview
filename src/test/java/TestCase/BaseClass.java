package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;

	@BeforeMethod

	public void base() {

		WebDriverManager.chromedriver().setup();

		this.driver = new ChromeDriver();
		driver.get("https://www.fitpeo.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MICROSECONDS);

	}

	@AfterMethod

	public void quite() {
		driver.quit();
	}

}
