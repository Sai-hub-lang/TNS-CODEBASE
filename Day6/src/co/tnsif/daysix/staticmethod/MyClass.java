package co.tnsif.daysix.staticmethod;

public class MyClass {
	
	private int section;
	
	private static int srno = 1000;
	
	//Static block
	
	static {
		System.out.println("-----------Within Static Block------------");
		
	//	Myclass b = new Myclass();
		
		srno =10000;
		
		
	}
	
	// default constuctor
	

	public MyClass() {
		
		System.out.println("--------------Within Default block--------------");
		
		srno++;
		section++;
	}

	
	//static method
	
	@Override
	public String toString() {
		return "MyClass [serial no "+ srno+"section=" + section + "  ]";
	}


	static void dispaly() {
		
	// 	System.out.println("Section: "+ section);
		System.out.println("Srno: "+ srno);
	}
	
	
	
	
	

}
