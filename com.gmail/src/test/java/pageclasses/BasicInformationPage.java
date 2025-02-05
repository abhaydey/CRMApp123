package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasicInformationPage {
	
	public WebDriver driver;
	public WebElement element;
	
	public BasicInformationPage(WebDriver driver) {
		this.driver = driver;    
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(id="month")
	public WebElement selectMonthDropDown;
	
	@FindBy(id="day")
	public WebElement dayField;
	
	@FindBy(id="year")
	public WebElement yearField;
	
	@FindBy(id="gender")
	public WebElement selectGenderDropDown;
	
	@FindBy(xpath="//span[text()='Next']")
	public WebElement nextButton;
	
	@FindBy(xpath="//input[@name='Username']")
	public WebElement enterUserName;
	
	public void enterDay(String day) {
		dayField.sendKeys(day); 
		}
	
	public void enterYear(String year) { 
		yearField.sendKeys(year); 
		}
	
	public void enterUserName(String userName) { 
		enterUserName.sendKeys(userName); 
		}
	
	

	 
	
	
	public static void selectByVisibleTextMonth(WebElement selectMonthDropDown, String visibleText) {
        Select select = new Select(selectMonthDropDown);
        select.selectByVisibleText(visibleText);
    }
	 public void selectMonthByVisibleText(String month) {
		 selectByVisibleTextMonth(selectMonthDropDown, month);
	    }
	 
	 public static void selectByVisibleTextGender(WebElement selectGenderDropDown, String visibleText) {
	        Select select = new Select(selectGenderDropDown);
	        select.selectByVisibleText(visibleText);
	    }
	 
	 public void selectGenderByVisibleText(String gender) {
		 selectByVisibleTextGender(selectGenderDropDown, gender);
	    }

}
