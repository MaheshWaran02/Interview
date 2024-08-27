package POM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotalReimbursement {

	public static WebDriver driver;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[1]")
	WebElement Scroll;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[1]/label/span[1]/input")
	WebElement box1;
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[2]/label/span[1]/input")
	WebElement box2;
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[3]/label/span[1]/input")
	WebElement box3;
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[4]/label/span[1]/input")
	WebElement box4;

	@FindBy(xpath = "/html/body/div[2]/div[1]/header/div/p[4]/p")
	WebElement Value;

	public TotalReimbursement(WebDriver driver) throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Thread.sleep(3000);
	}

	public void scroll() {

		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("arguments[0].scrollIntoView();", Scroll);

	}

	public void CheckBox() {

		box1.click();
		box2.click();
		box3.click();
		box4.click();

		assertEquals(Value.getText(), "$88920");

	}

}
