 package org.adactim_pageexe.pack;

import org.adactim_locaters.pack.BookHotelLocaters;
import org.baseclass.pack.BaseClass;

public class BookHotelPageExecution extends SelectHotelPageExecution{
	public static void firstName() {
		BaseClass.typedata(new BookHotelLocaters().getLocOfFirstName(), excelRead("Sheet1", 12 , 0));
	}
	
	public static void lastName() {
		BaseClass.typedata(new BookHotelLocaters().getLocOfLastName(), excelRead("Sheet1", 12 , 1));
	}
	
	public static void billingAddress() {
		BaseClass.typedata(new BookHotelLocaters().getLocOfBillingAddress(), excelRead("Sheet1", 12 , 2));
	}
	
	public static void creditCardNum() {
		BaseClass.typedata(new BookHotelLocaters().getLocOfCreditCardNum(), excelRead("Sheet1", 12 , 3));
	}
	
	public static void cardType() {
		BaseClass.selectText(new BookHotelLocaters().getLocOfCreditCardType(), excelRead("Sheet1", 12 , 6) );
	}
	
	public static void month() {
		BaseClass.selectText(new BookHotelLocaters().getLocOfMonth(), excelRead("Sheet1", 12 , 7) );
	}
	
	public static void year() {
		BaseClass.selectText(new BookHotelLocaters().getLocOfYear(), excelRead("Sheet1", 12 , 8) );
	}
	
	public static void ccvNumber() {
		BaseClass.typedata(new BookHotelLocaters().getLocOfCcvNum(), excelRead("Sheet1", 12 , 9));
	}
	
	public static void bookNow() {
		BaseClass.click(new BookHotelLocaters().getLocOfBooknow());
	}
	
	public static void orderNo(String sheetname , int r, int c) {
		//String sheetName = "Sheet2";
		System.out.println("Your booking order number is " + BaseClass.getAttribute(new BookHotelLocaters().getLocOfOrderNo(), attribute_value));
		BaseClass.excelWrite( sheetname , r , c , BaseClass.getAttribute(new BookHotelLocaters().getLocOfOrderNo(), attribute_value));
		System.out.println();
	}
}