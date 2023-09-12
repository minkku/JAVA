package exec_01;

public class prgrammers {

	public static void main(String[] args) {
		// 객체 생성
		Burger b1 = new Burger();
	}
}
	// 만약에 class 명이 'a' 였다면 위에 7번라인도
	// Burger b1 = new Burger(); >> a b1 = new a(); 로 바뀌어야 한다.
	class Burger {
		// field : 정보
		String name;
		int price;
		// method : 동작
		void showInfo() {
			System.out.println(name + ": " + price + "won");
		}
	}
