package java01;

public class class_01 {

	public static void main(String[] args) {
		// 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
		// 유지보수 용이, 높은 재사용성
		
		// 차량용 블랙박스
		// 정보 : 모델명, 해상도, 가격, 색상
		
		// 만든 첫번쨰 제품
		String modelName = "까망이";
		String resolution = "FHD";
		int price = 200000;
		String color = "black";
		
		// 새로운 제품
		String modelName2 = "하양이";
		String resolution2 = "UHD";
		int price2 = 300000;
		String color2 = "white";
		
		Blackbox bbox = new Blackbox();
		// Blackbox 클래스로부터 bbox 객체 생성
		// bbox 객체는 Blackbox클래스의 인스턴스
	}

}
