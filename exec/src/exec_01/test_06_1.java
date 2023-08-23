package exec_01;

import java.util.Scanner;

public class test_06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학점계산기
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("학점계산기");
	      System.out.print("점수 :");
	      
	      int score = scan.nextInt();
	      int a = score % 10;
	      
	      String msg = "";
	      
	      if (score>=90) {
	    	  msg="A";
	      }	else if (score>=80) {
	    	  msg="B";
	    	  }
	      else if (score>=70) {
	    	  msg="C";
	    	  }
	      else { msg="F";
	      }

	      if (a>6&&score>=70 || score == 100) {
	    	  msg = msg+"+";
	     }
	      
	      System.out.printf( " 님의 " + " 학점은 " + msg +" 입니다.");
	}

}
