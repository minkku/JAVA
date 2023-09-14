package exec_01;

import java.time.*;

class Tv {
	String color;
	boolean power;
	int ch;
	
	// method of Tv
	void power() { power = !power; }	// TV를 켜거나 끄는 기능
	void channelUp() { ++ch; }			// TV의 채널을 높이는 기능
	void channelDown() { --ch; }		// TV의 채널을 낮추는 기능
}

class Clock {
	LocalTime n = LocalTime.now();		// 실시간 시간을 사용하기 위해서는 요거 쓰면 됌
	private int hour = n.getHour();
	private int minute = n.getMinute();
	private float second = n.getSecond();
	
	public int getHour() { return hour; }
	public int getMinute() { return minute; }
	public float getSecond() { return second; }
	
	// 실시간 시간을 구할때 불필요한 코드들
	public void setHour (int h) {
		if (h < 0 || h > 23) 
			return;
		hour = h;
	}
	public void setMinute (int m) {
		if (m < 0 || m > 59)
			return;
		minute = m;
	}
	public void setSecond (float s) {
		if (s < 0.0f || s > 59.99f)
			return;
		second = s;
	}
	
	public void getTime() {
		System.out.println("지금은 " + hour + "시 " + minute + "분 " + second + "초 입네다." );
	}
}

class Card {
	String kind;
	int num;
	static int width = 100;
	static int height = 250;
}

class FactorialTest {
	static long factorial (int n) {
		if(n <= 0 || n > 20) 
			return -1;
		if(n <= 1) return 1;
		return n * factorial(n-1);
	}
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
			System.out.println();
			
			
			
			// 객체 배열
			// Tv tv1, tv2, tv3;  == Tv[] tvArr = new Tv[3];
			System.out.println("===== example 3 =====");
			Tv tvArr[] = new Tv[3]; // 길이가 3인 Tv타입의 참조변수 배열
			
//			tvArr[0] = new Tv();
//			tvArr[1] = new Tv();
//			tvArr[2] = new Tv();
			
			// 배열의 초기화 블럭을 사용하면 한줄로 간단하게 표현 가능
			// Tv tvArr[] = { new Tv(), new Tv(), new Tv() }
			
			// 다뤄야할 객체가 많을 경우 for문을 사용하면 된다.
			// for(int i = 0; i < tvArr.length; i++) {
			//			tvArr[i] = new Tv();
			//}
			
			// Tv 객체를 생성해서 Tv 객체 배열의 각 요소에 저장
			for(int i = 0; i < tvArr.length; i++) {
				tvArr[i] = new Tv();
				tvArr[i].ch = i + 10; // tvArr[i]의 ch에 i+10을 저장
			}
			
			for (int i = 0; i < tvArr.length; i++) {
				tvArr[i].channelUp();
				System.out.printf("tvArr[%d].ch=%d%n",i,tvArr[i].ch);
			}
			System.out.println();
			
			System.out.println("===== example 4 =====");
			Clock now = new Clock();
			now.getTime();
			System.out.println();
			
			System.out.println("===== example 5 =====");
			Card c1 = new Card();
			c1.kind = "Heart";
			c1.num = 7;
			
			Card c2 = new Card();
			c2.kind = "Spade";
			c2.num = 10;
			
			System.out.println("C1은 " + c1.kind + ", " + c1.num + "이며, 크기는" + c1.width + ", " + c1.height);
			System.out.println("C2은 " + c2.kind + ", " + c2.num + "이며, 크기는" + c2.width + ", " + c2.height);
			System.out.println();
			
			System.out.println("===== example 6 =====");
			int n = 21;
			long result = 0;
			
			for(int i = 1; i <= n; i++) {
				result = FactorialTest.factorial(i);
				
				if(result == -1) {
					System.out.printf("유효하지 않은 값입니다.(0 < n <= 20:%d%n", n);
					break;
				}
				System.out.printf("%2d!=%20d%n", i, result);
			}
	}	// main의 끝
}
