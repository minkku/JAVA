package exec_01;

class Tv {
	String color;
	boolean power;
	int ch;
	
	// method of Tv
	void power() { power = !power; }	// TV를 켜거나 끄는 기능
	void channelUp() { ++ch; }			// TV의 채널을 높이는 기능
	void channelDown() { --ch; }		// TV의 채널을 낮추는 기능
}

public class ahhhhhhhh {	
	public static void main(String[] args) {
			System.out.println("===== example 1 =====");
			Tv t;			// 티비 인스턴스를 참조하기 위한 변수 t를 선언
			t = new Tv();	// 티비 인스턴스 생성
			t.ch = 7;		// 티비 인스턴스의 멤버변수 채널의 값을 7로 한다
			t.channelDown();// 티비 인스턴스의 메서드 채널 다운을 호줄
			System.out.println("현재 채널은 " + t.ch + " 입니다.");
			System.out.println();
			
			System.out.println("===== example 2 =====");
			Tv t1 = new Tv();
			Tv t2 = new Tv();
			System.out.println("t1의 ch값은 " + t1.ch + " 입니다.");
			System.out.println("t2의 ch값은 " + t2.ch + " 입니다.");
			
			t2 = t1;		// t1이 저장하고 있는 값 (주소)을 t2에 저장한다.
			t1.ch = 7;
			System.out.println("t1의 ch값을 7로 변경하였습니다.");
			
			System.out.println("t1의 ch값은 " + t1.ch + " 입니다.");
			System.out.println("t2의 ch값은 " + t2.ch + " 입니다.");
	}
}
