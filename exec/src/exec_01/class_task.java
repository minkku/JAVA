package exec_01;

public class class_task {

	public static void main(String[] args) {
		Hobbang a = new Hobbang();
		a.type = "팥";
		a.price = 600;
		System.out.println(a.hoho());
		
		Hobbang b = new Hobbang();
		b.type = "야채";
		b.price = 700;
		System.out.println(b.hoho());
		
		Hobbang c = new Hobbang();
		c.type = "피자";
		c.price = 900;
		System.out.println(c.hoho());
	}
}

	class Hobbang {
		
		// field
		static String type;
		int price;
		
		String hoho() {
			return String.format("%s 호빵: %d원", type, price);
		}
	}
