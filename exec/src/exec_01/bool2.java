package exec_01;

import java.util.Scanner;

public class bool2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		String result = num % 2 == 1 ? "홀" : "짝";  
		System.out.println(result);
	}
}

// 삼항연산자 표현