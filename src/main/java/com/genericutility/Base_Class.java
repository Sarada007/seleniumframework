package com.genericutility;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.genericutility.FileUtility;
import com.pageobjectry.Login_page;
import com.pageobjectry.Logout_page;

public class Base_Class {
  public static WebDriver driver;
	 public FileUtility f=new FileUtility();
	 public WebDriverUtility wLib=new WebDriverUtility();
@BeforeClass(groups="smoke,regression")
public void openBrowser() throws Throwable {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver=new ChromeDriver(options);
	wLib.maximizeWindow(driver);
	wLib.waitForPageLoad(driver);
	String Url = f.getPropertyKeyValue("url");
	driver.get(Url);
	
	
}
@BeforeMethod(groups="smoke,regression")
public void loginApplication() throws Throwable {
	Login_page login=new Login_page(driver);
	login.openLogin(driver);	
	
	
}
@AfterMethod
public void logoutApplication() {
	Logout_page logp=new Logout_page(driver);	
    logp.logoutOperation();
}
@AfterClass
public void closeBroser(){
	driver.close();
}
}
