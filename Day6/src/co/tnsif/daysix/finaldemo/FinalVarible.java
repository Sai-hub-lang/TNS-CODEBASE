package co.tnsif.daysix.finaldemo;

public class FinalVarible {

	//final int x ; // final instance must be intialized
	
	final int x = 100;
	
	// Declaring a static blank final varible
	
	final static int y;
	
	final static int z= 10;
	
	
	
	// instance method
	
	void change () {
		
	//	x = 20;
		
	//	x=30;   final varible cannot be change and assign
	//	z=50;
		
		
	}



	@Override
	public String toString() {
		return "FinalVarible [x=" + x + "]";
	}
	
	static {
		y=20; //in final static value assigned in  static block
		
	//	z= 80; BUT NOT CHANGE
		
		System.out.println("VALUE OF Y: "+ y);
	}
	
	
}
