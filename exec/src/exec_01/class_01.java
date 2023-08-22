package exec_01;

public class class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// print의 3가지 종류
		System.out.print("1");		// 기본적인 입력
		System.out.printf("2");		// 엔터 없음
		System.out.println("3");	// 출력시 자동 엔터
		
		// 만약 printf 혹은 print 를 사용시에 \n 혹은 %n 으로 줄바꿈을 해주면 된다.
		
		int a = 2;
		int b = 5;
		int c = a + b ;
		
		System.out.printf("%d와 %d의 합은 %d 입니다. %n", a,b,a+b);
		System.out.printf("%d와 %d의 합은 %d 입니다. %n", a,b,c);
	}

}
