package testclasses;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageclasses.GoogleCreateAccountPage;
import pageclasses.GoogleSignUpPage;
import utilityClasses.ExcelUtils;

public class GoogleCreateAccountTest extends BaseClass {
	
	public GoogleCreateAccountPage googleCreateAccountPage;
	
	 @BeforeClass(alwaysRun = true)
	  public void passDriverObject() throws InterruptedException  {
	    	
		 googleCreateAccountPage = new GoogleCreateAccountPage(driver);
	     Thread.sleep(2000);
	        
	    }
	 
	 @Test(dataProvider = "SignUpData")
	 public void TC001_enterName(String fname,String lname) throws InterruptedException, IOException {
		 
	//	 String fname = ExcelUtils.getCellData(1, 0);
	//     String lname = ExcelUtils.getCellData(1, 1);
	        
		googleCreateAccountPage.enterFirstName(fname);
		googleCreateAccountPage.enterLastName(lname);
		 
		 Thread.sleep(2000);
		 googleCreateAccountPage.nextButton.click();
	 }
	 
	 @DataProvider(name = "SignUpData")
	    public Object[][] getData() throws IOException {
	        return new Object[][]{
	                {ExcelUtils.getCellData("Sheet1", 1, 0), ExcelUtils.getCellData("Sheet1", 1, 1)},
	        };
	    }
	 

}
