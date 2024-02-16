package org.adactim_locaters.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelLocaters extends SelectHotelLocaters{
	public BookHotelLocaters() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name=\"first_name\"]")
	private WebElement locOfFirstName;
	public static String valueOfFirstName = "Arun Kumar";
	
	@FindBy(xpath = "//input[@name=\"last_name\"]")
	private WebElement locOfLastName;
	public static String valueOfLastName = "Manivannan";
	
	@FindBy(xpath = "//textarea[@name=\"address\"]")
	private WebElement locOfBillingAddress;
	public static String valueOfBillingAdd = "xyz street-3" + "\n"+"Erode-638001";
	
	@FindBy(xpath = "//input[@name=\"cc_num\"]")
	private WebElement locOfCreditCardNum;
	public static String creditcard_num = "1234567891011121";
	
	@FindBy(xpath = "//select[@name=\"cc_type\"]")
	private WebElement locOfCreditCardType;
	public static String visibleText_of_cardType = "VISA";
	
	@FindBy(xpath = "//select[@name=\"cc_exp_month\"]")
	private WebElement locOfMonth;
	public static String visibleText_of_Month = "May";
	
	@FindBy(xpath = "//select[@name=\"cc_exp_year\"]")
	private WebElement locOfYear;
	public static String visibleText_of_Year = "2024";
	
	
	@FindBy(xpath = "//input[@name=\"cc_cvv\"]")
	private WebElement locOfCcvNum;
	public static String valueOf_CcvNum = "345";
	
	@FindBy(xpath = "//input[@name=\"book_now\"]")
	private WebElement locOfBooknow;
	
	@FindBy(xpath = "//input[@name=\"order_no\"]")
	private WebElement locOfOrderNo;
	
	public static String attribute_value = "value";

	public WebElement getLocOfFirstName() {
		return locOfFirstName;
	}

	public void setLocOfFirstName(WebElement locOfFirstName) {
		this.locOfFirstName = locOfFirstName;
	}

	public WebElement getLocOfLastName() {
		return locOfLastName;
	}

	public void setLocOfLastName(WebElement locOfLastName) {
		this.locOfLastName = locOfLastName;
	}

	public WebElement getLocOfBillingAddress() {
		return locOfBillingAddress;
	}

	public void setLocOfBillingAddress(WebElement locOfBillingAddress) {
		this.locOfBillingAddress = locOfBillingAddress;
	}

	public WebElement getLocOfCreditCardNum() {
		return locOfCreditCardNum;
	}

	public void setLocOfCreditCardNum(WebElement locOfCreditCardNum) {
		this.locOfCreditCardNum = locOfCreditCardNum;
	}

	public WebElement getLocOfCreditCardType() {
		return locOfCreditCardType;
	}

	public void setLocOfCreditCardType(WebElement locOfCreditCardType) {
		this.locOfCreditCardType = locOfCreditCardType;
	}

	public WebElement getLocOfMonth() {
		return locOfMonth;
	}

	public void setLocOfMonth(WebElement locOfMonth) {
		this.locOfMonth = locOfMonth;
	}

	public WebElement getLocOfYear() {
		return locOfYear;
	}

	public void setLocOfYear(WebElement locOfYear) {
		this.locOfYear = locOfYear;
	}

	public WebElement getLocOfCcvNum() {
		return locOfCcvNum;
	}

	public void setLocOfCcvNum(WebElement locOfCcvNum) {
		this.locOfCcvNum = locOfCcvNum;
	}

	public WebElement getLocOfBooknow() {
		return locOfBooknow;
	}

	public void setLocOfBooknow(WebElement locOfBooknow) {
		this.locOfBooknow = locOfBooknow;
	}

	public WebElement getLocOfOrderNo() {
		return locOfOrderNo;
	}

	public void setLocOfOrderNo(WebElement locOfOrderNo) {
		this.locOfOrderNo = locOfOrderNo;
	}
}
