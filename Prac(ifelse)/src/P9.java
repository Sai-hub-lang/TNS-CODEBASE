import java.util.*;
public class P9 {
	
	
	// data member
	
	private String name;
	private int income;
	private String gender;
	private int age;
	private long mobileNumber;
	private int tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "P9 [name=" + name + ", income=" + income + ", gender=" + gender + ", age=" + age + ", mobileNumber="
				+ mobileNumber + ", tax=" + tax + "]";
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	
	
}
