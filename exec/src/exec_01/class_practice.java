package exec_01;

public class class_practice {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		
		// 객체 값 초기화
		h1.name = "이즈리얼";
		h1.helth = 100;
		h1.dmg = 350;
		
		// 객체에게 메소드 수행
		h1.punch();
	}
}

	class Hero {
		// field
		String name;
		int helth;
		int dmg;
		
		//method
		void punch() {
			 System.out.println(name + "의 펀치!");
			 System.out.println(dmg + "dmg");
		}
	}

// 다음 필드와 메소드를 갖는 영웅 클래스를 구현하시오
// field : 이름, 체력
// method : 펀치
