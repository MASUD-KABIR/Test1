package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CategoryPage {

			WebDriver driver;

			public CategoryPage(WebDriver driver) {
				this.driver = driver;
			}

			@FindBy(how = How.NAME, using = "categorydata") WebElement INSERT_DATA_IN_CATEGORY_FIELD;
			@FindBy(how = How.CSS, using = "input[value='Add category']") WebElement ADD_CATEGORY_BUTTON; 

			public void insertCategoryData(String categoryData) {
				INSERT_DATA_IN_CATEGORY_FIELD.sendKeys(categoryData);
			}
			public void ClickAddCategoryButton() {
				ADD_CATEGORY_BUTTON.click();
			}
		}