package exec_01;

public class practice_array {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int sum = 0;
		
		for(int i = 0; i < a.length; i++ ){
			System.out.printf(">>>>> i 의 값 : %d\n", i);
			System.out.printf(">>>>> a.length의 값 : %d\n", a.length);
			sum += a[i];
			System.out.println(sum);
		}
	}

}
