package exec_01;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String msg;
		int result;
		
		System.out.print("몇개의 사과가 있나요? : ");
		result = sc.nextInt();
		
		if(result / 10 != 0) {
			int a = result;
			a = Math.round(a) + 1;
			msg = String.format("바구니의 갯수는 " + a +"개" + " 입니다.");
			System.out.println(msg);
		}
		sc.close();
	}

}

// 1개의 바구니에 10개의 사과를 넣을 수 있습니다.
// 사과는 123개가 있습니다.