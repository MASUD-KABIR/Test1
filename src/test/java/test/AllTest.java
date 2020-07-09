package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllTest {
	WebDriver driver;

	@BeforeTest
	public void lunchBrowser() {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://techfios.com/test/101/");
		driver.manage().window().maximize();

	}

	@Test
	public void test() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

//Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.
		driver.findElement(By.name("allbox")).click();

//Validate that a single list item could be removed using the remove button when a single checkbox is selected.
		driver.findElement(By.name("todo[7]")).click();
		driver.findElement(By.name("submit")).click();

//Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on.
		driver.findElement(By.name("allbox")).click();
		driver.findElement(By.name("submit")).click();

//		Validate a user is able to add a category and once the category is added it should display.

		driver.findElement(By.name("categorydata")).sendKeys("AbCd");
		driver.findElement(By.cssSelector("input[value='Add category']")).click();

// Validate a user is not able to add a duplicated category. If it does then the following message
//will display:"The category you want to add already exists: <duplicated category name>."

		driver.findElement(By.name("categorydata")).sendKeys("AbC");
		driver.findElement(By.cssSelector("input[value='Add category']")).click();

		// Validate the month drop down has all the months (jan, feb, mar ...) in
		// the Due Date dropdown section.

		Thread.sleep(3000);

		driver.findElement(By.cssSelector("select[name='due_month']")).click();
		WebElement DROPDOWN_LOCATOR = driver.findElement(By.cssSelector("select[name='due_month']"));

//		driver.findElement(By.xpath("//select[@name='due_month']"));
//		WebElement DROPDOWN_LOCATOR = driver.findElement(By.xpath("//select[@name='due_month']"));
//
		Select sel = new Select(DROPDOWN_LOCATOR);
		sel.selectByVisibleText("Jan");

	// Scenario 1: Sky Blue Background; Given: "Set SkyBlue Background" button exists;
	// When: I click on the button; Then: the background color will change to sky blue.

		driver.findElement(By.cssSelector("button[onclick='myFunctionSky()']")).click();
		driver.findElement(By.xpath("//button[@onclick='myFunctionSky()']")).click();

	// Scenario 2: White Background Change; Given: "Set SkyWhite Background" button exists;
	// When: I click on the button; Then: the background color will change to white.

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("button[onclick='myFunctionWhite()']")).click();
//		driver.findElement(By.xpath("//button[@onclick='myFunctionWhite()']")).click();
	}

	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}