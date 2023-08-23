package exec_01;

import java.util.Scanner;

public class bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int result;
		
		System.out.print("숫자를 입력하세요 : ");
		result = sc.nextInt();
		
		if(result % 2 == 1) {
			System.out.println("홀");
		}else {
			System.out.println("짝");
		}
		sc.close();
	}
}

// 숫자를 입력받아서, 짝수인지 홀수인지 판별