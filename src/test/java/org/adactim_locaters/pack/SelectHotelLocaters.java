package org.adactim_locaters.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelLocaters extends SearchHotelLocaters{
	public SelectHotelLocaters() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name=\"radiobutton_0\"]")
	private WebElement SelectHotel;
	
	
	@FindBy(xpath = "//input[@name=\"continue\"]")
	private WebElement Continue;


	public WebElement getSelectHotel() {
		return SelectHotel;
	}

	public void setSelectHotel(WebElement selectHotel) {
		SelectHotel = selectHotel;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public void setContinue(WebElement continue1) {
		Continue = continue1;
	}
	
}
