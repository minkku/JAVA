package java01;

import java.util.Scanner;

public class getters_and_setters {
	public static void main(String[] args) {
		Blackbox b1 = new Blackbox();
		b1.modelName = "까망이";
		b1.resolution = "FHD";
		b1.price = 300000;
		b1.color = "black";
		
		//할인 행사
		b1.price = -5000;
		System.out.println("가격 : " + b1.price + "원");
		
		Blackbox b2 = new Blackbox();
		b2.setModelName("하양이");
		b2.setPrice(-5000);
		
		System.out.println("가격은 : " + b2.getPrice() + "원");
		System.out.println("해상도 : " + b2.getResolution());
	}
}
