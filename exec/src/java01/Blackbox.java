package java01;

public class Blackbox {
	String modelName;
	String resolution;
	int price;
	String color;
	int serialNum;
	// static이 붙지않은것은 그냥 인스턴스 변수
	
	static int counter = 0; // 시리얼 번호를 생성해주는 역활 (처음에는 0 이였다가 ++ 연산자를 통해서 값 증가);
	
	static boolean canAutoReport = false; // 자동 신고 기능
	// 여기에 static을 붙이게 되면 클래스 변수라고 함
	// static 변수는 모두가 같은 기능을 공유해야할때 사용한다 그 외의 중복된 값이 들어가면 안되는 기능은
	// 그냥 변수로 표기
	
	//can overloading
	Blackbox() {
//		System.out.println("기본 생성자 호출");
//		this.serialNum = ++counter;
//		System.out.println("새로운 시리얼 넘버 : " + this.serialNum);
	}
	
	Blackbox(String modelName, String resolution, int price, String color){
//		this(); // this() 해주게 되면 자동으로 Blackbox(){} 을 사용할 수 있게된다.
//		
//		this.modelName = modelName;
//		this.resolution = resolution;
//		this.price = price;
//		this.color = color;
	}
	
	void autoReport() {
		if(canAutoReport) {
			System.out.println("충돌이 감지되어 자동으로 신고합니다.");
		} else {
			System.out.println("자동 신고 기능이 지원되지 않습니다.");
		}
	}
	
	void insertMemoryCard(int capacity) {
		if(capacity > 0 ) {
			System.out.println("메모리 카드가 삽입되었습니다.");
			System.out.println("용량은 " + capacity + "GB 입니다.");
		} else {
			System.out.println("메모리카드가 없습니다.");
		}
	}
	
	int getVideo(int type) {
		if(type == 1) {
			return 9;
		} else if (type == 2) {
			return 1;
		}
		return 10;
	}
	
	// showDataTime : 날짜정보 표시여부
	// showSpeed : 속도정보 표시여부
	// min : 영상 기록 단위(분)
	
	void record(boolean showDataTime, boolean showSpeed, int min) {
		System.out.println("녹화를 시작합니다.");
		if(showDataTime) System.out.println("영상에 날짜 정보가 표시됩니다.");
		if(showSpeed) System.out.println("영상에 속도정보가 표시됩니다.");
		System.out.println("영상은" + min + "분 단위로 기록됩니다.");
	}
	// this is overloading
	void record() {
		record(true, true, 5);
	}
	
	static void callServiceCenter() {
		System.out.println("서비스 센터 (1588-1111) 로 연결합니다.");
		// 같은 static으로 지정한 클래스 변수에 값은 같은 클래스 함수에서 값을 바꿀 수 있지만
		// 인스턴스 변수는 클래스 메소드에서 값을 변경 불가하다.
	}

	void appendModelName(String modelName) {
		this.modelName += modelName;
		// 인스턴스 변수명과 매개변수 명이 똑같으면 this를 사용하면 된다.
		// 만약 매개변수와 인스턴스 변수명이 다르면 굳이 this를 사용하지 않아도 된다.
	}
	
	// getter & setter 
	String getModelName() {
		return modelName;
	}
	
	void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	String getResolution() {
		if(resolution == null || resolution.isEmpty()) {
			return "판매자에게 문의하세요";
		}
		return resolution;
	}
	
	void setResolution(String resolution) {
		this.resolution = resolution;
	}
	
	int getPrice() {
		return price;
	}
	
	void setPrice(int price) {
		if(price < 100000) {
			this.price = 100000;
		} else {
			this.price = price;
		}
	}
}
