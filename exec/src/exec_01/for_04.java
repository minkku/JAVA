package exec_01;

import java.util.Scanner;

public class for_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Type 'boom' >> ");
		String a = sc.nextLine();

		int i, j;
		int result = 0;

		if(a.equals("boom")) {
			for(i = 2; i <= 9; i++) {
				for(j = 1; j <= 9; j++) {
					if(i >= j) {
						result = i * j;
					}
					System.out.print(i + " * " + j + " = " + result );
				}
				System.out.println();
			}
		}

	}

}
