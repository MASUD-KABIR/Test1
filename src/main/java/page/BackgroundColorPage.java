package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundColorPage {

	WebDriver driver;

	public BackgroundColorPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "button[onclick='myFunctionSky()']")
	WebElement SKY_BLUE_BACKGROUND_COLOR_BUTTON;

	@FindBy(how = How.CSS, using = "button[onclick='myFunctionWhite()']")
	WebElement WHITE_BACKGROUND_COLOR_BUTTON;

	public void FindingBackgroundColorButton() {
		SKY_BLUE_BACKGROUND_COLOR_BUTTON.click();

		WHITE_BACKGROUND_COLOR_BUTTON.click();
	}

}
