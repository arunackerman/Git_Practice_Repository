package org.adactim_projexe.pack;

import java.util.Date;

import org.adactim_pageexe.pack.BookHotelPageExecution;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;
//JUnit project

public class AdactimProjExe extends BookHotelPageExecution{
	@BeforeClass //
	public static void bc() { 
		//bc - browser launch 
		//Runnig a method even before the methods under the @Test annotation
		browserlaunch();
		maximizeWindow();
		getUrl(readProperty("url"));
		System.out.println("BeforeClass");
	}
	
	@Test // Executes the test cases
	public void test1() {
		
		username();
		password();
		login();
		System.out.println("Login page");
	}
	
	@Test
	public void test2() {
		location();
		hotel();
		roomType();
		noOfRooms();
		checkInDate();
		checkOutDate();
		adultsPerRoom();
		childrenPerRoom();
		search();
		System.out.println("Searching Page");
	}
	
	@Test
	public void test3() {
		selectButton();
		continuee();
		System.out.println("Select Page");
	}
	
	@Test
	public void test4() {
		firstName();
		lastName();
		billingAddress();
		creditCardNum();
		cardType();
		month();
		year();
		ccvNumber();
		bookNow();
		implicitlyWait(8);
		System.out.println("Booking Page");
	}
	
	@Test 
	public void test5() {
		System.out.println("Order number printble phase");
		 getTitle();
	     orderNo("Sheet11", 1, 1);
	}
	
	@AfterClass @Ignore
	public static void uu_test6_close() {
		System.out.println("AfterClass");
		close();
		
	}
	
	@Before
	public void before() { //Executed before each test caseses executed
		Date d = new Date();
		System.out.println("@Before : " + d);
	}
	
	@After
	public void after() { //Executed after each test casees executed
		Date d = new Date();
		System.out.println("@After : " + d);
	}
	/*public static void main(String [] args) {
		AdactimProjExe objref = new AdactimProjExe();	
		
	}*/

}
