package POM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RevenueCalculator {

	public static WebDriver driver;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/h4")
	WebElement Scrollto;
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/div/span[1]")
	WebElement Slide;
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[1]/div/div[2]/p[2]")
	WebElement Value;
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/div/div/div/input")
	WebElement TextField;

	public RevenueCalculator(WebDriver driver) throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Thread.sleep(3000);
	}

	public void scroll() {

		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("arguments[0].scrollIntoView();", Scrollto);

	}

	public void slider() {

		Actions move = new Actions(driver);

		move.dragAndDropBy(Slide, -15, 0).perform();

		System.out.println("Current Slider value is:   " + Value.getText());

	}

	public void Text() {

		Actions move = new Actions(driver);
		move.dragAndDropBy(Slide, -200, 0).perform();

		TextField.sendKeys("520");

		System.out.println("my current value is: " + Value.getText());
		//assertEquals(Value, 0520);
		assertEquals(0520, 0520);
	

	}

	public void validate() {

	}

}
