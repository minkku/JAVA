package java01;

public class overload {
// 생성자의 중복 제거
//	class ExamList {
//		private Exam[] exams;
//		private int current;
//		
//		public ExamList() {
//			exams = new Exam[3];
//			current = 0;
//		}
//		//this 로 중복 제거가 가능하다.
//		public ExamList() {
//			this(3);
//		}
//		
//		public ExamList(int size) {
//			exams = new Exam[size];
//			current = 0;
//		}
//	}

	static class OverLoadingMethods {
		public void print() {
			System.out.println("오버로딩 1");
		}
		
		String print(Integer a) {
			System.out.println("오버로딩 2");
			return a.toString();
		}
		
		void print(String a) {
			System.out.println("오버로딩 3");
			System.out.println(a);
		}
		
		String print(Integer a, Integer b) {
			System.out.println("오버로딩 4");
			return a.toString() + b.toString();
		}
	}
	
	public static void main(String[] args) {
		OverLoadingMethods om = new OverLoadingMethods();

		om.print();
		System.out.println(om.print(3));
		om.print("Hello!");
		System.out.println(om.print(4, 5));
	}

}
