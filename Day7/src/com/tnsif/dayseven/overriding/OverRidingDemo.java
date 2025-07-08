package com.tnsif.dayseven.overriding;

public class OverRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI rbi;
		
		rbi = new SBI();
		
		System.out.println(rbi.getRateofInterest());
		
		rbi = new ICICI();
		
		System.out.println(rbi.getRateofInterest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateofInterest());
		
		
		

	}

}
