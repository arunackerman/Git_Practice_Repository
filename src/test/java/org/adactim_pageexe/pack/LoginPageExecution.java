package org.adactim_pageexe.pack;

import org.adactim_locaters.pack.BookHotelLocaters;
import org.adactim_locaters.pack.LoginPageLocaters;
import org.baseclass.pack.BaseClass;

public class LoginPageExecution extends BookHotelLocaters{
	public static void username() {
		BaseClass.typedata(new LoginPageLocaters().getUserName() , readProperty("username"));
	}
	
	public static void password() {
		BaseClass.typedata(new LoginPageLocaters().getPassWord(), readProperty("password"));
	}
	
	public static void login() {
		BaseClass.click(new LoginPageLocaters().getLogin());
	}

}
