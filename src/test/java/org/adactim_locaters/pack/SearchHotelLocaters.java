package org.adactim_locaters.pack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelLocaters extends LoginPageLocaters{
	
	public SearchHotelLocaters() {PageFactory.initElements(driver, this);}
	
	@FindBy(xpath = "//select[@name=\"location\"]")
	private WebElement location;
	//public static String visibleText_of_Location = "New York";
	
	@FindBy(xpath = "//select[@name=\"hotels\"]")
	private WebElement locOfHotel;
	//public static String visibleText_of_Hotel = "Hotel Sunshine";
	
	@FindBy(xpath = "//select[@name=\"room_type\"]")
	private WebElement locOfRoomType;
	//public static String visibleText_of_RoomType = "Super Deluxe";
	
	@FindBy(xpath = "//select[@name=\"room_nos\"]")
	private WebElement locOfNumOfRooms;
	//public static String visibleText_of_NumOfRooms = "1 - One";
	
	@FindBy(xpath = "//input[@name=\"datepick_in\"]")
	private WebElement locOfCheckInDate;
	//public static String checkInDate = "19/12/2023";
	
	@FindBy(xpath = "//input[@name=\"datepick_out\"]")
	private WebElement locOfCheckOutDate;
	//public static String checkOutDate = "20/12/2023";
	
	@FindBy(xpath = "//select[@name=\"adult_room\"]")
	private WebElement locOfAdultsPRoom;
	//public static String visibleText_of_AdultsPRoom = "2 - Two";
	
	@FindBy(xpath = "//select[@name=\"child_room\"]")
	private WebElement locOfChildPRoom;
	//public static String visibleText_of_ChildPRoom = "0 - None";
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement locOfSearch;

	//Getter and Setter methods
	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getLocOfHotel() {
		return locOfHotel;
	}

	public void setLocOfHotel(WebElement locOfHotel) {
		this.locOfHotel = locOfHotel;
	}

	public WebElement getLocOfRoomType() {
		return locOfRoomType;
	}

	public void setLocOfRoomType(WebElement locOfRoomType) {
		this.locOfRoomType = locOfRoomType;
	}

	public WebElement getLocOfNumOfRooms() {
		return locOfNumOfRooms;
	}

	public void setLocOfNumOfRooms(WebElement locOfNumOfRooms) {
		this.locOfNumOfRooms = locOfNumOfRooms;
	}

	public WebElement getLocOfCheckInDate() {
		return locOfCheckInDate;
	}

	public void setLocOfCheckInDate(WebElement locOfCheckInDate) {
		this.locOfCheckInDate = locOfCheckInDate;
	}

	public WebElement getLocOfCheckOutDate() {
		return locOfCheckOutDate;
	}

	public void setLocOfCheckOutDate(WebElement locOfCheckOutDate) {
		this.locOfCheckOutDate = locOfCheckOutDate;
	}
	
	public WebElement getLocOfChildPRoom() {
		return locOfChildPRoom;
	}

	public void setLocOfChildPRoom(WebElement locOfChildPRoom) {
		this.locOfChildPRoom = locOfChildPRoom;
	}

	public WebElement getLocOfSearch() {
		return locOfSearch;
	}

	public void setLocOfSearch(WebElement locOfSearch) {
		this.locOfSearch = locOfSearch;
	}

	public WebElement getLocOfAdultsPRoom() {
		return locOfAdultsPRoom;
	}

	public void setLocOfAdultsPRoom(WebElement locOfAdultsPRoom) {
		this.locOfAdultsPRoom = locOfAdultsPRoom;
	}

}
