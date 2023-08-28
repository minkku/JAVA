package exec_01;

import java.util.Scanner;
import java.util.Random;

public class while1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
		
		int randomNum = 0;
		int guessNum = 0;
		int count = 0;
		
		System.out.println("Random Game: guess number 1 ~ 50");
		randomNum = rm.nextInt(50);
		System.out.println(randomNum);
		
		do {
			// 입력받는 메소드를 꼭 반복문 안에 같이 넣어줘야함
			System.out.println("Guess Number : ");
			guessNum = sc.nextInt();
			
			if(randomNum < guessNum) System.out.println("DOWN");
			if(randomNum > guessNum) System.out.println("UP");
			if(randomNum == guessNum) System.out.println("CORRECT");
			else {
				count ++;				
			}
		} while(randomNum != guessNum); 
		{
			System.out.printf("오답횟수 : %d ",count);
		}
	}
}
