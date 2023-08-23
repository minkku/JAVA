package exec_01;

import java.util.Scanner;

public class ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("숫자를 입력해주세요 : ");
		num = sc.nextInt();
		
		String result = num % 3 == 0 ? "3의 배수입니다." : "3의 배수가아닙니다.";
		System.out.println((result));
	}

}

// result = score >= 90? "A" : score >= 80 ? "B" :score >= 70 ? "C" : "F";
// 조건 ? 식1(참이면 여기) : 식2(거짓이면 여기) 
// 숫자를 입력받아서, 3의 배수인지 아닌지 판별하는 프로그램