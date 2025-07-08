package com.tnsif.dayseven.overriding;

public class ICICI extends RBI{
	
	public float getRateofInterest() {
		System.out.println("Base rate of interest of home");
		
		return 8.0f;
	}

}
