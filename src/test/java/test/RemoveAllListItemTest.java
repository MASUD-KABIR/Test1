package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.RemoveAllListPage;
import util.BrowserFactory;

public class RemoveAllListItemTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbletoCheckCheckBox() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();

		RemoveAllListPage checkBox = PageFactory.initElements(driver, RemoveAllListPage.class);

		checkBox.ClickCheckBox();

		RemoveAllListPage RemoveAllButton = PageFactory.initElements(driver, RemoveAllListPage.class);

		RemoveAllButton.ClickRemoveButton();

	}

	@AfterTest
	public void tearDown() {

		driver.close();
		driver.quit();

	}
}