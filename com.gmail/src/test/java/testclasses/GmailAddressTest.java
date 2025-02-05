package testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageclasses.GmailAddressPage;

public class GmailAddressTest extends BaseClass {
	
	GmailAddressPage gmailAddressPage;
	

	 @BeforeClass(alwaysRun = true)
	  public void passDriverObject() throws InterruptedException  {
	    	
		 gmailAddressPage = new GmailAddressPage(driver);
	     Thread.sleep(2000);
	        
	    }
	 
	 @Test
	 public void TC001_gmailaddressSelect() throws InterruptedException {
		 
		 gmailAddressPage.selectFirstAddressRadioButton.click();
		 Thread.sleep(2000);
		 gmailAddressPage.nextButton.click();
	 }

}
