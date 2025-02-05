package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePasscodePage {
	
	public WebDriver driver;
	public WebElement element;
	
	public CreatePasscodePage(WebDriver driver) {
		this.driver = driver;    
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//input[@name='Passwd']")
	public WebElement passwordField;
	
	@FindBy(xpath="//input[@name='PasswdAgain']")
	public WebElement confirmPasswordField;
	
	@FindBy(xpath="//span[text()='Next']")
	public WebElement nextButton;
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password); 
		}
	
	public void enterConfirmPassword(String cnfPassword) { 
		confirmPasswordField.sendKeys(cnfPassword); 
		}

}
