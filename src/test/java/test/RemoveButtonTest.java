package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.RemoveButtonPage;
import util.BrowserFactory;

public class RemoveButtonTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbletoCheckCheckBox() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();

		RemoveButtonPage singleCheckBox = PageFactory.initElements(driver, RemoveButtonPage.class);

		singleCheckBox.ClickSingleCheckBox();

		RemoveButtonPage RemoveButton = PageFactory.initElements(driver, RemoveButtonPage.class);

		RemoveButton.ClickRemoveButton();
	}
	@AfterTest
	public void tearDown() {
	
		driver.close();
		driver.quit();

}

}