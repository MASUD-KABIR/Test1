package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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

//		WebElement singleCheckBoxChecked = driver.findElement(By.name("submit"));
//		System.out.println("Single List Item is removed when single check box is SELECTED -" + singleCheckBoxChecked.isSelected());

//		String singleCheckBoxChecked = driver.findElement(By.name("submit")).getText();
//		Assert.assertEquals("Remove", singleCheckBoxChecked, "Single item Removed!!!");
//
//		boolean status = driver.findElement(By.name("submit")).isSelected();
//		
//		if(status){
//			System.out.println("Single Checkbox is checked");
//		} else {
//			System.out.println("Single Checkbox is removed");
//		}
//	}

//	@AfterTest
//	public void tearDown() {
//
//		driver.close();
//		driver.quit();
//
//	}
}
}