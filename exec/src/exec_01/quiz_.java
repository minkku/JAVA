package exec_01;

public class quiz_ {
	// Using method getHiddenData();
	
	public static String getInfo(String data, int index) {
		String hidden = data.substring(0, index);
		
		for(int i = 0; i < data.length() - index; i++) {
			hidden  += "*";
		}
		return hidden;
	}
	
	public static void main(String[] args) {
		// 개인정보를 비공개로 전환하는 메소드 작성
		// 하나의 메소드에서 모든 동작 처리
		// 각 정보는 아래ㅔ 위치부터 비공개 적용
		// 이름 : 2번째 글자 (이민규)
		// 주민등록번호 : 9번째 글자 (951221 - 1*****)
		// 전화번호 : 010 - 1234 - ****
		String name = "이민규";
		String identi = "951221-1222222";
		String mobile = "010-1234-5678";
		
		System.out.println("이름: " + getInfo(name, 1));
		System.out.println("주민번호: " + getInfo(identi, 8) );
		System.out.println("전화번호: " + getInfo(mobile, 9));
	}
}
