package exec_01;

import java.util.Scanner;

public class practice_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String num = "";
		String msg = "";
		String i = "============="; 
		
		for (;;) {
			 System.out.printf("ID : ");
			 num = sc.nextLine();
			 
			 if(num.equals("exit")) {
				 break;
			 }switch (num.charAt(7)) {
			 case '1', '3' :
				msg = "male";
			 	break;
			 case '2', '4' :
				msg = "female";
			 	break;
			 }
			 	System.out.println(msg);
			 	System.out.println(i);
			 	System.out.println("Want to exit? enter 'exit'.");
		}
		msg = "bye";
		System.out.println(msg);
	}
}
