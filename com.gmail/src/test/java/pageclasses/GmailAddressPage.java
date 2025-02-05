package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailAddressPage {

	public WebDriver driver;
	public WebElement element;
	
	public GmailAddressPage(WebDriver driver) {
		this.driver = driver;    
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath="(//div[@class='t5nRo Id5V1'])[1]")
	public WebElement selectFirstAddressRadioButton;
	
	@FindBy(xpath="//span[text()='Next']")
	public WebElement nextButton;
}
