package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSignUpPage {
	
	public WebDriver driver;
	public WebElement element;
	
	public GoogleSignUpPage(WebDriver driver) {
		this.driver = driver;    
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="//gws-dropdown-button[@v-align='Below']//div[@aria-label='Create an account']")
	public  WebElement createAccountButton;
	
	@FindBy(xpath="//gws-dropdown-button[@v-align='Below']//span[@class='link__label'][normalize-space()='For my personal use']")
	public  WebElement myPersonalUseDropDown;
	
	

}
