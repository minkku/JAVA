package java01;

public class instance_variables {
	public static void main(String[] args) {
		Blackbox b1 = new Blackbox();
		
		b1.modelName = "까망이";
		b1.resolrution = "FHD";
		b1.price = 200000;
		b1.color = "블랙";
		
		System.out.println(b1.modelName);
		System.out.println(b1.resolrution);
		System.out.println(b1.price);
		System.out.println(b1.color);
		
		Blackbox b2 = new Blackbox();
		
		b2.modelName = "하양이";
		b2.resolrution = "UHD";
		b2.price = 300000;
		b2.color = "white";
		
		System.out.println(b2.modelName);
		System.out.println(b2.resolrution);
		System.out.println(b2.price);
		System.out.println(b2.color);
	}
}
