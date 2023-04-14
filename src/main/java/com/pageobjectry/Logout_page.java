package com.pageobjectry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page {
@FindBy(xpath="//*[name()='svg'and@ aria-label='Your profile']")
private WebElement imageBox;
@FindBy(xpath="//span[.='Log Out']")
private WebElement logoutTx;
public Logout_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getImageBox() {
	return imageBox;
}
public WebElement getLogoutTx() {
	return logoutTx;
}
public void logoutOperation() {
	imageBox.click();
	logoutTx.click();
}
}
