package com.tnsif.association.has;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address adress = new Address("405 Laxmi nagar","Pune","Maharastra","322-322");
		
		Person p = new Person("Sai",adress);
		p.displayInfo();

	}

}
