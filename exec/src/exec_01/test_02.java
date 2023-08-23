package exec_01;

import java.util.Scanner;

public class test_02 {
/*
 * 조건문한당
 * 
 * [형태]
 * if(조건){
 * 		자바스크립트랑 똑같음
 * } else{
 * 
 * }
 * 
 * 1. 스캐너로 숫자 두개 입력 + 연산자
 * 2. 더하기 연산
 * 3. 결과값 출력
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, write your score : ");
		
		int score = scan.nextInt();
		System.out.println("score : " + score);
		
		if(score == 100) {
			System.out.printf("참 잘했어요!");
		} else if (score <= 100) {
			System.out.printf("공부해오세용");	
		} else if (score >= 100) {
			System.out.printf("탐지 할 수 없는 숫자입니다.");
		}
	}
	
}
