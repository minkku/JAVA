package exec_01;

public class class_practice {

	public static void main(String[] args) {
		// default instance : 텅빈 생선자로 클래 내부에 아무것도 정의가 되지 않아있는경우 자동적으로 기입된다.
		Hero h1 = new Hero();	// 객체를 생성 h1{name: null, hp: 0};
		// 객체 값 초기화
		h1.name = "이즈리얼";		// 객체를 생성 h1{name: 이즈리얼, hp: 0};
		h1.hp = 100;			// 객체를 생성 h1{name: 이즈리얼, hp: 100};
		
		// 객체에게 메소드 수행
		h1.punch();				// 객체를 생성 h1{name: 이즈리얼, hp: 100}.punch();
								// 결과값 : [이즈리얼]의 펀치!
		
		Hero h2 = new Hero("간달프", 80); // 객체를 생성과 동시에 생성자를 통해서 초기화 시켜줌
		h2.punch();
	}
}

	class Hero {
		// field
		String name;
		int hp;

		// 생성자
		// 특징1 : 리턴 타입 명시가 없는 메소드
		// 특징2 : 이름이 클래스명과 같다
		Hero(){
			
		}
		Hero(String _name, int _hp) {
			name = _name;
			hp = _hp;
		}
		
		//method
		void punch() {
			 System.out.printf("[%s]의 펀치!\n", name);
		}
	}

// 다음 필드와 메소드를 갖는 영웅 클래스를 구현하시오
// field : 이름, 체력
// method : 펀치
