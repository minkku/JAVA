package exec_01;

public class remind3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// task 1 / 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오

		int i, j;
		int result = 0;
		int b = 1;

		for(i = 1; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0) {
				result += i;
			}
		}
		System.out.println("1번문제 정답 : " + result);

		// task 02 / 1+(1+2)+(1+2+3)+(1+2+3+4)+.....+(1+2+3+4+5+6+7+8+9+10) 의 결과를 계산하시오.
		
		result = 0;
		
		for(i = 1; i <= 10; i++) {
			for(j = 1; j <= i; j++) {
				result += j;
				}			
		}
		System.out.println("문제2번 정답 : " + result);
		
		
		// task 3 / 1+(-2)+3+(-4)+....과 같은 식으로 계속 더해나갔을때 몇까지 더해야 총합이 100이상이 되는지 구하시오.
		
		result = 0;
		int result2 = 0;
		int count = 0;
		
		for(i = 1;; i++) {
			if(i % 2 == 0) {
				result = -i;
			}else {
				result = i;
			}
			count = result + result2;
			if(count >= 100) {
				System.out.println("3번정답 : " + count);
				break;
			}
		}
	}

}