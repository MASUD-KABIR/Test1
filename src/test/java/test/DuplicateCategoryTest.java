package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import page.DuplicateCategoryPage;
import util.BrowserFactory;

public class DuplicateCategoryTest {

	WebDriver driver;

	@Test
	public void UserShouldNotBeAbleToDuplicateSameCategory() throws InterruptedException {
		driver = BrowserFactory.launchBrowser();

		DuplicateCategoryPage categoryData = PageFactory.initElements(driver, DuplicateCategoryPage.class);

		categoryData.insertCategoryData("JAVA_Winter2021");

		DuplicateCategoryPage AddCategoryButton = PageFactory.initElements(driver, DuplicateCategoryPage.class);

		AddCategoryButton.ClickAddCategoryButton();

		Thread.sleep(3000);
		categoryData.insertCategoryData("JAVA_Winter2021");
		AddCategoryButton.ClickAddCategoryButton();

	}

	@AfterTest
	public void tearDown() {

		driver.close();
		driver.quit();

	}
}