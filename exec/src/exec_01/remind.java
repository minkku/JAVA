package exec_01;

public class remind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// task 01

		int result;

		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				result = i*j; 
				if( i >= j);
				System.out.println(i + " * " + j  + " = " + result);
			}
			System.out.println();
		}
		// task 02
		String star = "*";
		
		for(int s = 1; s <= 5; s++) {
			System.out.print(star);
		}
		// task 03
		
		for(int ss = 1; ss <= 5; ss++) {
			for(int a = 1; a <= 5; a++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		// task 04
		
		for(int b = 1; b <= 5; b++) {
			for(int z = 0; b < z; z++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

	
}
