package exec_01;

public class method {
	// parameter 매개변수
	public static void power(int num) {
		int result = num * num;
		System.out.println(num + " 의 2승은 " + result);
	}
	
	public static void main(String[] args) {
		power(3);
	}
}
