package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.BackgroundColorPage;
import util.BrowserFactory;

public class BackgroundColorTest {
	WebDriver driver;

	@Test
	public void UserShouldBeAbletoFindAllMonthsInDropdown() {
		driver = BrowserFactory.launchBrowser();

		BackgroundColorPage findingSkyColor = PageFactory.initElements(driver, BackgroundColorPage.class);

		findingSkyColor.FindingBackgroundColorButton();

		BackgroundColorPage findingWhiteColor = PageFactory.initElements(driver, BackgroundColorPage.class);

		findingWhiteColor.FindingBackgroundColorButton();

	}
	@AfterTest
	public void tearDown() {
	
		driver.close();
		driver.quit();

}

}