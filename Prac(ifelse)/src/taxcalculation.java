
public class taxcalculation {
	
	
	public void calculatetax(P9 p) {
		
		if(p.getAge() > 65 || p.getGender().equalsIgnoreCase("female")) {
			
			p.setTax(0);
			
			System.out.println("Tax is not applicable");
			
		} else {
			if(p.getIncome()<= 160000) {
				p.setTax(0);
				System.out.println("No tax");
			}else if(p.getIncome()>=160000 && p.getIncome()<=500000) {
				
				p.setTax(0);
				System.out.println();
				
			}else if(p.getIncome()>=500000 && p.getIncome()<= 800000) {
				p.setTax(0);
			}else {
				p.setTax(0);
				System.out.println();
			}
		}
	}

	
}
