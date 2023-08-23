package exec_01;

import java.util.Scanner;

public class test_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용하실 연산자를 입력해주세요[ 더하기, 빼기, 나누기, 곱셈 ]");
		String c = sc.nextLine();
		
		System.out.println("숫자를 입력해주세요");
		int a = sc.nextInt();
		System.out.println("숫자를 입력해주세요");
		int b = sc.nextInt();;
		
		int result = 0;
		int result2 = 0;
		
		if(c.equals("더하기")) {	
			result = a + b;
		} else if (c.equals("빼기")) {
			if (a < b) {
				result = b - a;
			} else {
				result = a - b;
			}
		} else if (c.equals("나누기")) {
			result = a / b;
		} else if (c.equals("곱셈")) {
			result = a * b;
		} else {
			System.out.println("잘못된 수식어 입니다.");
		}
		System.out.println("결과는 : " + (result));
	}
}



/*
 * < 계산기 만들기 >
 * 숫자를 두개 입력받고, 연산자를 입력받아서 해당 연산의 출력값만 보여주기
 * 뒷자리 7 8 9 학점에 + 
 * */
 