/*
 * 학점 처리
 * 1. 사용자에게 점수 입력받기
 * 2. 점수에 따라 학점 부여하기
 * 3. 사용자가 입력한 점수에 따라 학점 출력하기
 * 90점 이상 : A 학점
 * 80점 이상 : B 학점
 * 70점 이상 : C 학점
 * 그 이하   : F 학점
 * */

package exec_01;

import java.util.Scanner;

public class test_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		String msg = " ";
		
		System.out.println("시험 점수를 입력해주세요 >> ");
		int score = i.nextInt();
		
		if(score >= 90 && score< 100) {
			msg = "당신의 학점은 : A ";
		}else if (score >= 80 && score < 90) {
			msg = "당신의 학점은 : B";
		}else if (score >= 70 && score < 80) {
			msg = "당신의 학점은 : C";
		}else if(score <= 70 && score < 70) {
			msg = "당신의 학점은 : F ";
		}else {
			msg = "올바른 점수를 쓰세요.";
		}
		System.out.println(msg);
	}
}
