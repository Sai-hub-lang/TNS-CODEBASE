package com.tnsif.association.singleinheritance;
// Parent Class
public class Citizen {
	
	private String name;
	private String adharNo;
	private String address;
	private long phone;
	public Citizen() {
		System.out.println("Citizen object created");
	}
	public Citizen(String name, String adharNo, String address, long phone) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.address = address;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	// Getter and Setter 
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharNo=" + adharNo + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	

}
