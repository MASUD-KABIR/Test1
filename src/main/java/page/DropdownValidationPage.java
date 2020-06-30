package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DropdownValidationPage {

	WebDriver driver;

	public DropdownValidationPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "select[name='due_month']")
	WebElement DROPDOWN_LOCATOR;

	public void FindingAllMonthsInDropdown() {
		DROPDOWN_LOCATOR.click();
	}

}