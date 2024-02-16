package org.adactim_locaters.pack;

import org.baseclass.pack.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLocaters extends BaseClass{
	
	//Constructor {PageFactory.initElements(driver, this);}
	
	public LoginPageLocaters() {PageFactory.initElements(driver, this);}
	
	//private variable declaration
	@FindBy(xpath = "//input[@type=\"text\"]")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement passWord;
	
	@FindBy(xpath = "//input[@name=\"login\"]")
	private WebElement login;
	
	//Getter and Setter methods methods
	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	// step 1 : FindBy and provide the locater details
	// step 2 : getter and setter methods
	// constructor
}
