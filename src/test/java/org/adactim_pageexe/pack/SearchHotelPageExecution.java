package org.adactim_pageexe.pack;

import org.adactim_locaters.pack.SearchHotelLocaters;
import org.baseclass.pack.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchHotelPageExecution extends LoginPageExecution{
	public static void location() {
		BaseClass.selectText(new SearchHotelLocaters().getLocation(), excelRead("Sheet1", 1 , 0));
	}
	
	public static void hotel() {
		BaseClass.selectText(new SearchHotelLocaters().getLocOfHotel(), excelRead("Sheet1", 1 , 1));
	}
	
	public static void roomType() {
		BaseClass.selectText(new SearchHotelLocaters().getLocOfRoomType(), excelRead("Sheet1", 1 , 2));
	}
	
	public static void noOfRooms() {
		BaseClass.selectText(new SearchHotelLocaters().getLocOfNumOfRooms(), excelRead("Sheet1", 1 , 3) );
	}
	public static void checkInDate() {
		BaseClass.typedata(new SearchHotelLocaters().getLocOfCheckInDate(), excelRead("Sheet1", 1 , 4));
	}
	
	public static void checkOutDate() {
		BaseClass.typedata(new SearchHotelLocaters().getLocOfCheckOutDate(), excelRead("Sheet1", 1 , 5));
	}
	
	public static void adultsPerRoom() {
		BaseClass.selectText(new SearchHotelLocaters().getLocOfAdultsPRoom(), excelRead("Sheet1", 1 , 6));
	}
	
	public static void childrenPerRoom() {
		BaseClass.selectText(new SearchHotelLocaters().getLocOfChildPRoom(), excelRead("Sheet1", 1 , 7));
	}
	
	public static void search() {
		BaseClass.click(new SearchHotelLocaters().getLocOfSearch());
	}
}
