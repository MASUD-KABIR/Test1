package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.DropdownValidationPage;
import util.BrowserFactory;

public class DropdownValidationTest {

//	private static final WebElement DROPDOWN_LOCATOR = null;
	WebDriver driver;

	@Test
	public void UserShouldBeAbletoFindAllMonthsInDropdown() {
		driver = BrowserFactory.launchBrowser();

		DropdownValidationPage findingAllMonths = PageFactory.initElements(driver, DropdownValidationPage.class);

		findingAllMonths.FindingAllMonthsInDropdown();

//		Select sel = new Select(DROPDOWN_LOCATOR);
//		sel.selectByVisibleText("Mar");

	}
	@AfterTest
	public void tearDown() {

		driver.close();
		driver.quit();
	}
}