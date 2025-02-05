package testclasses;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageclasses.GoogleSignUpPage;


public class GoogleSignUpTest extends BaseClass {
	
	public GoogleSignUpPage googleSignUpPage;
	
	 @BeforeClass(alwaysRun = true)
	  public void passDriverObject() throws InterruptedException  {
	    	
		 googleSignUpPage = new GoogleSignUpPage(driver);
	     Thread.sleep(2000);
	        
	    }
	
	@Test
	public void TC001_createAccount() throws InterruptedException{
		
		SoftAssert sa= new SoftAssert();
		
		googleSignUpPage.createAccountButton.click();
		Thread.sleep(2000);
		googleSignUpPage.myPersonalUseDropDown.click();
		Thread.sleep(3000);
		sa.assertAll();
	}
	
}
