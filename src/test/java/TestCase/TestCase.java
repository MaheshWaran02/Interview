package TestCase;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import POM.Calculator;
import POM.RevenueCalculator;
import POM.TotalReimbursement;

public class TestCase extends BaseClass {

	@Test
	public void test1() throws InterruptedException {

		Calculator Calculter = new Calculator(driver);
		Calculter.Caculter();

		RevenueCalculator Revenu = new RevenueCalculator(driver);
		Revenu.scroll();
		Revenu.slider();
		Revenu.Text();
		Revenu.validate();

		TotalReimbursement Reimbursement = new TotalReimbursement(driver);

		Reimbursement.scroll();
		Reimbursement.CheckBox();

	}

}
