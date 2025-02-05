package testclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageclasses.GoogleSignUpPage;

public class BaseClass {
	
	protected static WebDriver driver;
    protected static Properties properties;
    
	// This method is for properties file
    public void defineProperties(){

        properties = new Properties();
        try {
            File file = new File("C://Users//Deb//Desktop//OrangeCRM//com.gmail//config.properties");
            FileInputStream fileInput = new FileInputStream(file);
            properties.load(fileInput);
        } catch (IOException e) {
            System.out.println("Exception"+e);
        }
               
    }
    
    @BeforeSuite
    public void launchBrowser() throws InterruptedException{
   	 
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://workspace.google.com/intl/en-US/gmail/");
        Thread.sleep(5000);
        
 	 
     }
    
}
