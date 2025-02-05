package testclasses;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageclasses.BasicInformationPage;
import pageclasses.GoogleCreateAccountPage;
import utilityClasses.ExcelUtils;

public class BasicInformationTest extends BaseClass {
	
	BasicInformationPage basicInformationPage;
	

	 @BeforeClass(alwaysRun = true)
	  public void passDriverObject() throws InterruptedException  {
	    	
		 basicInformationPage = new BasicInformationPage(driver);
	     Thread.sleep(2000);
	        
	    }
	 
	 @Test
	 public void TC001_selectdob() throws Exception  {
		 
		 
		 basicInformationPage.selectMonthByVisibleText("January");
		
		 Thread.sleep(2000);
		 basicInformationPage.enterDay("17");
		 Thread.sleep(2000);
		 basicInformationPage.enterYear("1980");
		 Thread.sleep(2000);
		 basicInformationPage.selectGenderByVisibleText("Male");
		 
		 basicInformationPage.nextButton.click();
		 
		 Thread.sleep(2000);
		 basicInformationPage.enterUserName("arynkahn1234");
		 basicInformationPage.nextButton.click();
	 }
	 
	

}
