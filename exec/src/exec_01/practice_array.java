package exec_01;

public class practice_array {

	public static void main(String[] args) {
		//		int[] a = {1,2,3,4,5};
		//		int sum = 0;
		//		
		//		for(int i = 0; i < a.length; i++ ){
		//			System.out.printf(">>>>> i 의 값 : %d\n", i);
		//			System.out.printf(">>>>> a.length의 값 : %d\n", a.length);
		//			sum += a[i]; // sum = sum + a[i];
		//			System.out.println(sum);
		//		}

		//		int[] score = {1,2,3,4};
		//		
		//		for(int i = 0; i < score.length; i++ ) {
		//			System.out.println(score[i]);

		//		int i ;
		//		int[] score2 = new int[4];
		//		for(i = 0; i < score2.length; i++) {
		//			score2[i] = i + 1;
		//			System.out.println(score2[i]);
		//		}


		int num[] = new int[7];

		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*10) + 1;
			if(i % 2 == 0 && i != 0) {
				System.out.printf("%d ========\n", num[i]);
			}
			if(num[i] % 2 == 0 ) {
				System.out.println(num[i]);
			}
		}
	}
}

