package com.pageobjectry;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Friends_page {
@FindBy(xpath="(//span[.='Friends'])[1]")
private WebElement friendsTx;
@FindBy(xpath="//span[text()='Friend requests' and contains(@class,'x193iq5w xeuugli')]")
private WebElement friendsReqBox;
@FindBy(xpath="//input[@aria-label='Search Facebook']")
private WebElement searchBar;
//@FindBy(xpath="//span[.='shyam' and contains(@class,'x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft")
//private WebElement clickOnShyam;
public Friends_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getFriendsTx() {
	return friendsTx;
}
public WebElement getFriendsReqBox() {
	return friendsReqBox;
}
public WebElement getSearchBar() {
	return searchBar;
}
public void friendsOperation() {
	friendsTx.click();
	friendsReqBox.click();
	searchBar.sendKeys("shyam" +Keys.ENTER);
	
}
}
