package exec_01;

import java.util.Scanner;

public class switch_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		String grade = null;
		char plus = ' ';
		
		System.out.print("please, write your score : ");
		score = sc.nextInt();
		
		switch(score / 10) {
		case 10, 9 :
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		case 7 :
			grade = "C";
			break;
		default :
			grade = "F";
		}
		
		switch(score % 10) {
		case 9, 8, 7 :
			plus = '+';
			break;
		default : 
			if(score == 100) {
				grade = "A";
				plus = '+';
			}
		}
		System.out.println("your grade is " + grade+plus);
	}

}
