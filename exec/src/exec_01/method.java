package exec_01;

public class method {
	// parameter 매개변수
	public static void power(int num) {
		int result = num * num;
		System.out.println(num + " 의 2승은 " + result);
	}
	
	public static void powerByExp(int num2, int exponent) {
		int result = 1;
		for(int i = 0; i < exponent; i++) {
			result += num2;
		}
		System.out.println(num2 + " 의 " + exponent + " 승은 " + result);
	}
	
	// 반환값, return
	// void는 return 값이 없음
	// 호텔 전화번호
	public static String getPhoneNum() {
		String phoneNum = "02-6324-3222";
		System.out.println("호텔 전화번호는 : " + phoneNum);
		return phoneNum;
	}
	
	// 호텔 주소
	public static String getAdress() {
		return "서울시 어딘가";
	}
	// 호텔 엑티비티
	public static String getAct() {
		return "볼링장, 탁구장, 노래방";
	}
	
	// 전달값과 반환값이 있는 메소드
	public static int getPower(int number) {
		int result = number * number;
		return result;
	}
	
	public static int getPower(int number, int exponent) {
		int result = 1;
		for(int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}
	
	// 메소드 오버로딩 : 이름이 같은 메소드를 여러개 만드는것을 오버로딩이라고 칭함.
	// 오버로딩을 사용할 상황은 메소드의 전달값의 타입이 다르거나, 자료형이 다르거나 또는 갯수가 다르면 얼마든지 중복해서 사용 가능
	// 반환형이 다르면 오버로딩이 불가능, 반환형 타입이 같아야함!
	public static int getPower(String strNumber) {
		int number = Integer.parseInt(strNumber);
		return number * number;
	}
	
	// 메소드가 필요한 이유
	// 코드의 중복을 줄일 수 있땁
	
	public static void main(String[] args) {
		power(3);
		powerByExp(2,3);
		System.out.println();
		
		String phoneNum = getPhoneNum();
		
		String adress = getAdress();
		System.out.println("호텔 주소는 : " + adress);
		
		System.out.println("호텔 엑티비티는 : " + getAct());
		System.out.println();

		int retVal = getPower(2);
		System.out.println(retVal);
		
		retVal = getPower(3);
		System.out.println(retVal);
		
		retVal = getPower(3,3);
		System.out.println(retVal);
		
		System.out.println(getPower(3));
		System.out.println(getPower("4"));
		System.out.println();

		
	}
}
