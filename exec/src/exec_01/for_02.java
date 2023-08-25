package exec_01;

import java.util.Scanner;

public class for_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("구구 단 : ");
		int a = sc.nextInt();
		
			int result = 0;
			for (int i = 1; i <= 9; i++) {
				if(a <= 9) {
				result = i * a;
				System.out.println(a + " * " + i + " = " + result);
				} else {
					System.out.println("9 이상의 값은 곱할 수 없습니다.");
					break;
				}
			}
	}

}
