package com.pageobjectry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericutility.FileUtility;
import com.genericutility.WebDriverUtility;

public class Login_page {
	public static WebDriverUtility wLib=new WebDriverUtility();
@FindBy(id="email")
private WebElement emailTx;
@FindBy(id="pass")
private WebElement pwdTx;
@FindBy(name="login")
private WebElement logTx;
public Login_page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getEmailTx() {
	return emailTx;
}
public WebElement getPwdTx() {
	return pwdTx;
}
public WebElement getLogTx() {
	return logTx;
}
public void openLogin(WebDriver driver) throws Throwable {
	wLib.waitForPageLoad(driver);
	FileUtility f=new FileUtility();
	String EmailTx = f.getPropertyKeyValue("Email");
	String Pwdtx=f.getPropertyKeyValue("password");
	emailTx.sendKeys(EmailTx);
	pwdTx.sendKeys(Pwdtx);
	logTx.click();
	
}
}

