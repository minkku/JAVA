package exec_01;

import java.util.Scanner;

public class ternary_operator_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String msg;
		int result;
		
		System.out.println("숫자를 입력해주세요 : ");
		result = sc.nextInt();
		
		if(result % 3 == 0) {
			msg = ("3의 배수입니다.");
		} else {
			msg = ("3의 배수가 아닙니다.");
		}
		System.out.println((msg));
	}

}
