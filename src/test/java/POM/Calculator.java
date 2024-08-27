package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculator {

	public static WebDriver driver;

	@FindBy(xpath = "/html/body/div[1]/div/header/div/div[3]/div[6]/a/div")
	WebElement Calculater;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[2]/div/h4")
	WebElement Scrollto;

	public Calculator(WebDriver driver) throws InterruptedException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Thread.sleep(3000);
	}

	public void Caculter() {

		Calculater.click();

	}

	public void scroll() {

		JavascriptExecutor obj = (JavascriptExecutor) driver;
		obj.executeScript("arguments[0].scrollIntoView();", Scrollto);

	}

}
