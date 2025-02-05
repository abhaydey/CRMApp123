package testclasses;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageclasses.CreatePasscodePage;
import pageclasses.GmailAddressPage;
import utilityClasses.ExcelUtils;

public class CreatePasscodeTest extends BaseClass {
	
	CreatePasscodePage createPasscodePage;
	

	 @BeforeClass(alwaysRun = true)
	  public void passDriverObject() throws InterruptedException  {
	    	
		 createPasscodePage = new CreatePasscodePage(driver);
	     Thread.sleep(2000);
	        
	    }
	 
	 @Test(dataProvider = "passcodeData")
	 public void TC001_enterPasscode(String password,String cnfPassword) throws InterruptedException, IOException {
		 
	//	 String fname = ExcelUtils.getCellData(1, 0);
	//     String lname = ExcelUtils.getCellData(1, 1);
	        
		 createPasscodePage.enterPassword(password);
		 createPasscodePage.enterConfirmPassword(cnfPassword);
		 
		 Thread.sleep(2000);
		 createPasscodePage.nextButton.click();
	 }
	 
	 
	 
	 @DataProvider(name = "passcodeData")
	    public Object[][] getData() throws IOException {
	        return new Object[][]{
	                {ExcelUtils.getCellData("Sheet2", 1, 0), ExcelUtils.getCellData("Sheet2", 1, 1)},
	        };
	    }

}
