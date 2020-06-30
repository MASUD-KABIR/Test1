package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.CategoryPage;
import util.BrowserFactory;

public class CategoryTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbletoCheckCheckBox() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();

		CategoryPage categoryData = PageFactory.initElements(driver, CategoryPage.class);

		categoryData.insertCategoryData("Winter2020");

		CategoryPage AddCategoryButton = PageFactory.initElements(driver, CategoryPage.class);

		AddCategoryButton.ClickAddCategoryButton();
	}

	@AfterTest
	public void tearDown() {

		driver.close();
		driver.quit();
	}
}