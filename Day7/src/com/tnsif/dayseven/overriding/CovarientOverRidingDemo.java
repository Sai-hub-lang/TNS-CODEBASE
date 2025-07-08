package com.tnsif.dayseven.overriding;


class Colour{
	protected Colour getColour() {
		Colour s = new Colour();
		return s;
	}
}

// Child class

class Red extends Colour {
	@Override
	
	protected Red getColour() {
		Red  s=new Red();
		return s;
	}
}

class Blue extends Colour{
	
	protected Blue getColour() {
		Blue s = new Blue();
		return s;
		
	}
}

public class CovarientOverRidingDemo {

}
