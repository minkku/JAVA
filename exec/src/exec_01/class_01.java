package exec_01;

import java.util.Scanner;

public class class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// print의 3가지 종류
		System.out.print("1");		// 기본적인 입력
		System.out.printf("2");		// 엔터 없음
		System.out.println("3");	// 출력시 자동 엔터
		
		// 만약 printf 혹은 print 를 사용시에 \n 혹은 %n 으로 줄바꿈을 해주면 된다.
/*		
		int a = 2;
		int b = 5;
		int c = a + b ;
		int num = a * b ;
		int num2 = a / b ;
		
		int i = a * b;
		int j = a / b;
		
		System.out.printf("%d와 %d의 합은 %d 입니다. %n", a,b,a+b);
		System.out.printf("%d와 %d의 합은 %d 입니다. %n", a,b,c);
		System.out.printf("%d와 %d의 곱합 값은 %d 입니다. %n", a,b,num);
		System.out.printf("%d와 %d의 나눈 값은 %d 입니다. %n", a,b,num2);
*/		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("입력할 숫자를 써주세용>");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용:"+input);
		System.out.printf("num=%d%n", num);
	}

}
