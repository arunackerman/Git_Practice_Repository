package org.adactim_pageexe.pack;

import org.adactim_locaters.pack.SelectHotelLocaters;
import org.baseclass.pack.BaseClass;

public class SelectHotelPageExecution extends SearchHotelPageExecution{
	public static void selectButton() {
		BaseClass.click(new SelectHotelLocaters().getSelectHotel());
	}
	
	public static void continuee() {
		BaseClass.click(new SelectHotelLocaters().getContinue());
	}
	
}
