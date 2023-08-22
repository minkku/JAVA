package exec_01;

import java.util.Scanner;

public class test_03 {

		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);

		        System.out.println("연산자를 입력하세요 (더하기, 빼기, 곱하기, 나누기): ");
		        String operator = s.nextLine();

		        System.out.println("첫 번째 숫자를 입력하세요: ");
		        int a = s.nextInt();

		        System.out.println("두 번째 숫자를 입력하세요: ");
		        int b = s.nextInt();

		        int result = 0;

		        if (operator.equals("더하기")) {
		            result = a + b;
		        } else if (operator.equals("빼기")) {
		            result = a - b;
		        } else if (operator.equals("곱하기")) {
		            result = a * b;
		        } else if (operator.equals("나누기")) {
		            result = a / b;
		        } else {
		            System.out.println("지원하지 않는 연산자입니다.");
		            return;
		        }

		        System.out.println("결과는: " + result);
		    }
		}
