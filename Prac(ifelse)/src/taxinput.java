import java.util.*;
public class taxinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		String gender = sc.next();
		
		
		
		P9 p = new P9();
		p.setName(name);
		p.setAge(age);
		p.setGender(gender);
		p.setIncome(age);

	}

}
