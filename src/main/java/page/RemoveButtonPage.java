package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveButtonPage {
	
		WebDriver driver;

		public RemoveButtonPage(WebDriver driver) {
			this.driver = driver;
		}

		@FindBy(how = How.NAME, using = "todo[4]") WebElement SINGLE_CHECK_BOX_LOCATOR;
		@FindBy(how = How.NAME, using = "submit") WebElement REMOVE_BUTTON_LOCATOR;

		public void ClickSingleCheckBox() {
			SINGLE_CHECK_BOX_LOCATOR.click();
		}
		public void ClickRemoveButton() {
			REMOVE_BUTTON_LOCATOR.click();
		}
	}
