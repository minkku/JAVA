package exec_01;

import java.util.Scanner;

public class mnm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int a , b, c;
		
		System.out.print("정수 두개를 써주세요 : ");
			a = s.nextInt();
			b = s.nextInt();
		
		System.out.println(a+" "+b);
		
			c = a + b;
		
		System.out.print("두 수를 더한 값은 :"+ c);
	}

}

// 정수를 2개 입력 받아서 결과값 출력하기
// 1단계 : 2, 5 입력
// 2단계 : 2 와 5를 변수에 저장