package com.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LipGlobal{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="username")
private WebElement txtuserName;
@FindBy(id="password")
private WebElement txtpassWord;
@FindBy(id="login")
private WebElement btnlogin;
public WebElement getTxtuserName() {
	return txtuserName;
}
public WebElement getTxtpassWord() {
	return txtpassWord;
}
public WebElement getBtnlogin() {
	return btnlogin;
}
public void Login(String username,String password) {
type(getTxtuserName(),username);
type(getTxtpassWord(),password);
click(getBtnlogin());

}
}
