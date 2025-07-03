
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 26;
		char y = 'Z';
		
		for(int i=1; i<=4; i++) {
			
			
			for(int j=1; j<=4; j++) {
				
				if(j%2 == 1) {
					System.out.print(x--+" ");
				}else {
					System.out.print(y--);
				}
				
				
			}
			
			System.out.println();
		}

	}

}
