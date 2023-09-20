package exec_01;

import java.util.Arrays;

public class real_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열의 선언과 생성
		// 타입[] 변수이름;
		// 변수이름 = new 타입[길이]

		// int[] score; int 타입의 배열을 다루기 위해 참조변수 score을 선언
		// score = new int[5]; int 타입의 값 ㄱ5개를 저장할 수 있는 배열 생성

		// int[] score = new int[5]; // 배열의 선언과 생성을 동시에

		/*
		 * 배열의 길이 배열이름.length
		 * 
		 * int[] arr = new int[5]; 길이가 5인 int배열 int tmp = arr.length; arr.length의 값은 5이고
		 * tmp에 5가 저장 배열은 한번 생성하면 길이를 바꿀 수 없다.
		 */

		int[] score = new int[6];

		// 배열의 모든 요소 출력
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}

		System.out.println();

		// 배열의 초기화
		// 배열의 각 요소에 처음으로 값을 저장하는 것

		/*
		 * int[] score = new int[6]; score[0] = 50; score[1] = 60; score[2] = 70;
		 * score[3] = 80; score[4] = 90; score[5] = 100;
		 * 
		 * 위 처럼 초기화가 가능하지만 일일이 해주는 번거로음을 없애기 위해 반복문을 사용하거나
		 * 
		 * int[] score = { 50, 60, 70, 80, 90, 100 } 으로 사용 가능하다 *new int[] 생략가능
		 */

		// 배열의 출력
		int[] iArr = { 100, 90, 80, 70, 60 };
		System.out.println(iArr);
		// 이렇게 하면 배열이 출력 안 되고 오류가 뜸

		// 반복문 사용 // 반복문 사용시 배열을 까고 배열 내용만 출력
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}

		// Arrays.toString 내장 메소드 사용, 배열을 문자열로 출력해줌 그래서 [ ] 배열안에 값으로 그대로 출력됨.
		// Arrays.toString 을 사용하기 위해서는 import를 해줘야함
		// import 안 될시에 ctrl + shift + o 단축키 사용
		System.out.println(Arrays.toString(iArr));
		System.out.println();
		// 총점과 평균 값 구하기

		int sum = 0;
		float avg = 0f;

		int[] score2 = { 100, 88, 100, 80, 90 };

		// sum += score2[0];
		// sum += score2[1];
		// sum += score2[2];
		// sum += score2[3];
		// sum += score2[4];

		// 위와 밑에 반복문과 같음

		for (int i = 0; i < score2.length; i++) {
			sum += score2[i];
		}

		avg = sum / (float) score2.length; // (float) 형변환을 시켜줘야지 제대로된 값이 출력된다.

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println();

		// max and min
		int[] score3 = { 82, 77, 33, 100, 52, 93 };

		int max = score3[0]; // 배열의 첫 번째 값을 최대값으로 초기화
		int min = score3[0]; // 배열의 첫 번째 값을 최소값으로 초기화

		for (int i = 0; i < score3.length; i++) {
			if (score3[i] > max) {
				max = score3[i];
			} else if (score3[i] < min) {
				min = score3[i];
			}
		} // end of for

		System.out.println("최대 값: " + max);
		System.out.println("최소 값: " + min);
		System.out.println();

		// 배열 숫자 랜덤으로 섞기

		int[] numA = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numA));

		for (int i = 0; i < numA.length; i++) {
			int n = (int) (Math.random() * 10);
			System.out.println("n의 값 : " + n);
			int tmp = numA[0];
			System.out.println("tmp의 값 : " + tmp);

			numA[0] = numA[n];
			numA[n] = tmp;
		}
		System.out.println(Arrays.toString(numA));
		System.out.println();

		// Lotto

		int[] ball = new int[45];

		// 배열의 각 요소에 1 ~ 45의 값을 지정
		for (int i = 0; i < ball.length; i++)
			ball[i] = i + 1;

		int tmp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수
		System.out.println(Arrays.toString(ball));

		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45); // J에 랜덤값을 넣어주고
			tmp = ball[i]; // tmp에 ball 인덱스 값을 넣고
			ball[i] = ball[j]; // 다시 빈 배열 ball[i]에 랜덤으로 들어간 ball[j] 값을 넣어주고
			ball[j] = tmp; // 빈 ball[j]를 tmp 값을 넣어준다.
		}
		System.out.println(Arrays.toString(ball));

		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
		System.out.println();

		// String배열의 선언과 생성
		// String[] name = new String[3];

		String[] strArr = { "가위", "바위", "보" };
		System.out.println(Arrays.toString(strArr));

		for (int i = 0; i < strArr.length; i++) {
			int tmp2 = (int) (Math.random() * 3);
			System.out.println(strArr[tmp2]);
		}
		System.out.println();

		// 2차원 배열
		// 4행 3열
		int[][] score4 = new int[4][3];
		// 2차원 배열의 초기화
//		int[][] arr2 = new int[][] {{1,2,3,}, {4,5,6}};
//		int[][] arr2 = { {1,2,3}, {4,5,6} }; 		 위의 방법보단 이 방법으로 초기화를 많이함

		// 직관적으로 표현하기 위해 2차원 배열의 초기화는 이런식으로 많이 씀
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };

		// quiz for array
		// 쇼핑몰에서 구매가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오
		// 조건
		// 신발 사이즈는 250 - 295 까지 5단위로 증가
		// 신발 사이즈 수는 총 10가지

		int[] sizeArr = new int[10];

		for (int i = 0; i < sizeArr.length; i++) {
			sizeArr[i] = 250 + (5 * i);
		}
		System.out.println(Arrays.toString(sizeArr));
		
		// forEach 아주 편함
		for ( int size : sizeArr) {
			System.out.println("사이즈 " + size + " (재고 있음)");
		}
	}

}
