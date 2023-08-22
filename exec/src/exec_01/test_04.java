package exec_01;

import java.util.Scanner;

public class test_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 뺄샘 연산시,
		// 현재 3,8 입력 : -5
		// 개선 8,3 입력과 같게 : 5
		
		Scanner s = new Scanner(System.in);
		String msg = "";
		
		msg = "뺄셈을 해주세요";
		
		msg = "숫자를 입력해주세요 : ";
		int a = s.nextInt();
		
		msg = "숫자를 입력해 : ";
		int b = s.nextInt();
		
		if(a <= b) {
			msg = "두개의 값은 : "+ ( b - a);
		} else {
			msg ="두개의 값은 : " + ( a - b);
		}
		System.out.println(msg);
	}
	

}
