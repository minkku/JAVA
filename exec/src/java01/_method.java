package java01;

public class _method {
	public static void main(String[] args) {
		Blackbox b1 = new Blackbox();
		b1.modelName = "까망이";
		
		b1.autoReport(); // 지원 안됨
		Blackbox.canAutoReport = true;
		b1.autoReport(); // 지원 됨
		
		b1.insertMemoryCard(0);
		
		// 일반 영상 : 1
		// 이벤트 영상 (충돌 감지) : 2
		// 아무 값이 없을땐 10 출력
		
		System.out.println(b1.getVideo(0));
	}
}
