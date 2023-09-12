package exec_01;

public class prgrammers {

	public static void main(String[] args) {
		// 객체 생성
		Burger b1 = new Burger();
	}
}
	class Burger {
		// field : 정보
		String name;
		int price;
		// method : 동작
		void showInfo() {
			System.out.println(name + ": " + price + "won");
		}
	}
