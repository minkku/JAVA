package exec_01;

public class class_task {

	public static void main(String[] args) {
		Hobbang a = new Hobbang();
		
		a.type = "호빵";
		a.price = 600;
		
		a.hoho();
	}
}

	class Hobbang {
		
		// field
		String type;
		int price;
		
		void hoho() {
			System.out.println("팥 " + type + price + "won");
			System.out.println("야채 " + type + price + "won");
			System.out.println("피자 " + type + price + "won");
		}
	}
