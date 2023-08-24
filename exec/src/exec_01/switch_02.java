package exec_01;

import java.util.Scanner;

public class switch_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String regNo = "";
		String msg = null;
		
		System.out.printf("주민번호를 입력해 : ");
		regNo = sc.nextLine();
		
		switch(regNo.charAt(7)) {
		case '1', '3' :
			msg = "남자";
			break;
		case '2', '4' :
			msg = "여자";
			break;
		default :
			msg = "올바른 주민번호 써";
		}
		System.out.println("너는 " + msg);
		sc.close();
	}
}

// 주민번호를 입력받아서 남자인지 여자인지 출력하기
// ex/ regNo.charAt(7) << 뒤에 7자리를 빼줌
// charAt() 을 사용할때 타입지정을 유의해서 보자!!!