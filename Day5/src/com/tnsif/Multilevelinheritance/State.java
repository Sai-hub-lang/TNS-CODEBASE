package com.tnsif.Multilevelinheritance;

// child of Country
public class State extends Counry {
	
	
	// data member
	
	private String Statename;
	private String Langyage;
	public String getStatename() {
		return Statename;
	}
	public void setStatename(String statename) {
		Statename = statename;
	}
	public String getLangyage() {
		return Langyage;
	}
	public void setLangyage(String langyage) {
		Langyage = langyage;
	}
	
	
	@Override
	public String toString() {
		return "State [Statename=" + Statename + ", Langyage=" + Langyage + ", getCountryname()=" + getCountryname()
				+ ", getCapital()=" + getCapital() + "]";
	}

	

}
