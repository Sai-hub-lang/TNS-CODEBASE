import java.util.*;
public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int number [] = new int [size];
		
		for (int i=0; i<size; i++) {
			number[i] = sc.nextInt();
		}
		
		for(int i=0; i<number.length; i++) {
			System.out.println("Array index"+ i+1+"value"+ i);
		}
		

	}

}
