package exec_01;

import java.util.Scanner;

public class for_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		for(int i = 1; i <= 53; i++) {
			if(i % 4 != 0) {
				System.out.printf(i + " ");
			}else if (i % 4 == 0) {
				result += i;
			}
		}
		System.out.println(); // 줄바꿈을 위해서 공백줄 추가
		System.out.println("4의 배수를 더한 값 : " + result);			
	}
}
