package co.tnsif.daysix.staticmethod;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating first object of the class
		
		Employee e = new Employee("SAI",1001);
		Employee.companyname= "wipro";
		System.out.println(e);

	}

}
