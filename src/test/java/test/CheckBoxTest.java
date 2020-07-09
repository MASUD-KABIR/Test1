package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.ChecKBoxPage;
import util.BrowserFactory;

public class CheckBoxTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbletoCheckCheckBox() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();

		ChecKBoxPage checkBox = PageFactory.initElements(driver, ChecKBoxPage.class);

		checkBox.ClickCheckBox();

		WebElement toggelAll = driver.findElement(By.name("allbox"));
		System.out.println("All checkBox is checked when toggel all check box is CHECKED - " + toggelAll.isSelected());
	}

	@AfterTest
	public void tearDown() {

		driver.close();
		driver.quit();

	}
}