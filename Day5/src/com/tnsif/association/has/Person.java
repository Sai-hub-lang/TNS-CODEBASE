package com.tnsif.association.has;

public class Person {
	
	private String name;
	private Address address;
	public Person(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	// method to display persono info
	
	public void displayInfo() {
		System.out.println("Name: "+ name);
		
	    System.out.println("ADDRESS: "+ address.getStreet() + "CITY: "+  address.getCity()+ "STATE: "+ address.getState()+ "POSTALCODE"+ address.getPostalcode());
	    }
	
	//to String 
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	

}
