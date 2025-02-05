package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleCreateAccountPage {

	public WebDriver driver;
	public WebElement element;
	
	public GoogleCreateAccountPage(WebDriver driver) {
		this.driver = driver;    
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(xpath="//span[text()='Next']")
	public WebElement nextButton;
	
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname); 
		}
	
	public void enterLastName(String lname) { 
		lastName.sendKeys(lname); 
		}
}
