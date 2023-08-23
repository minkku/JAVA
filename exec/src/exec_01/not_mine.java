package exec_01;

public class not_mine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scanner = new Scanner(System.in);
	      
	      int tensu = 0;
	      tensu = scanner.nextInt();
	      
	      if(tensu >=90 && tensu <= 96) {
	         System.out.println("A");
	      }else if ( tensu >96 && tensu <= 100) {
	         System.out.println("A+");
	      }else if (tensu >=80 && tensu <= 86) {
	         System.out.println("B");
	      }else if (tensu > 86 && tensu < 90) {
	         System.out.println("B+");
	      }else if (tensu >=70 && tensu <= 76) {
	         System.out.println("C");
	      }else if (tensu > 76 && tensu < 80 ) {
	         System.out.println("C+");
	      }else if (tensu < 70 && tensu >= 0 ) {
	         System.out.println("F");
	      }else if (tensu < 0 || tensu > 100) {
	         System.out.println("입력 오류");
	      }else {
	         
	      }


	-------------------------------------------------------------------------------------

	int a=0;
	      
	      Scanner scan = new Scanner(System.in);
	      System.out.println("점수를 입력 해주세요");
	      a= scan.nextInt();
	      
	      if(a<=100 && a>=90) {
	         if(a>=97) {System.out.println("학점은 A+ 학점입니다.");}
	         else {System.out.println("학점은 A 학점입니다.");}
	      }else if(a>=80) {
	         if(a>=87) {System.out.println("학점은 B+ 학점입니다.");}
	         else {System.out.println("학점은 B 학점입니다.");}
	      }else if(a>=70) {
	         if(a>=77) {System.out.println("학점은 C+ 학점입니다.");}
	         else {System.out.println("학점은 C 학점입니다.");}
	      }else if(a<70 && a >=0) {
	         System.out.println("학점은 F 학점입니다.");
	      }else if(a>100 || a<0) {
	         System.out.println("점수 입력 오류입니다.");
	      }

	--------------------------------------------------------------------------------------

	System.out.printf("점수를 입력하세요 : ");
	         int score = sc.nextInt();
	         char grade;
	         char option = ' ';
	         
	         if(score > 100 || score < 0) {
	            System.out.println("점수는 100점~0점 사이로 입력해주세요!");
	         } else {
	            if(score >= 90) {
	               grade = 'A';
	               if(score >= 97) {
	                  option = '+';
	               }
	               System.out.printf("당신의 학점은 %c%c입니다.", grade, option);
	            } else if(score >= 80) {
	               grade = 'B';
	               if(score >= 87) {
	                  option = '+';
	               }
	               System.out.printf("당신의 학점은 %c%c입니다.", grade, option);
	            }else if(score >= 70) {
	               grade = 'C';
	               if(score >= 77) {
	                  option = '+';
	               }
	               System.out.printf("당신의 학점은 %c%c입니다.", grade, option);
	            } else {
	               grade = 'F';
	               System.out.printf("당신의 학점은 %c입니다.", grade);
	            }


	--------------------------------------------------------------------------------------


	 //학점계산기
	      Scanner scan = new Scanner(System.in);
	      System.out.println("학점계산기");
	      System.out.print("이름 :");
	      String name = scan.next();
	      System.out.print("과목 :");
	      String subject = scan.next();
	      System.out.print("점수 :");
	      int score = scan.nextInt();
	      int a = score % 10;
	      String msg = "";
	      
	      
	      if (score>=90) {
	   msg="A";
	}
	      else if (score>=80) {msg="B";}
	      else if (score>=70) {msg="C";}
	      else {msg="F";}

	      if (a>6&&score>=70) {
	   msg = msg+"+";
	     }
	      
	      System.out.printf(name+ " 님의 " +subject+ " 학점은 " +msg+" 입니다.");


	--------------------------------------------------------------------------------------------


	System.out.printf("점수를 입력하세요 : ");
	         int score = sc.nextInt();
	         char grade;
	         char option = ' ';
	         
	         if(score > 100 || score < 0) {
	            System.out.println("점수는 100점~0점 사이로 입력해주세요!");
	         } else {
	            if(score >= 90) {
	               grade = 'A';
	               if(score >= 97) {
	                  option = '+';
	               }
	               System.out.printf("당신의 학점은 %c%c입니다.", grade, option);
	            } else if(score >= 80) {
	               grade = 'B';
	               if(score >= 87) {
	                  option = '+';
	               }
	               System.out.printf("당신의 학점은 %c%c입니다.", grade, option);
	            }else if(score >= 70) {
	               grade = 'C';
	               if(score >= 77) {
	                  option = '+';
	               }
	               System.out.printf("당신의 학점은 %c%c입니다.", grade, option);
	            } else {
	               grade = 'F';
	               System.out.printf("당신의 학점은 %c입니다.", grade);
	            }
	}

}
	         
	         /* 1. 계산기 만들기
	          * 숫자를 두 개 입력받고, 연산자를 입력받아서
	          * 해당 연산의 출력값만 보여주기
	          * 
	          * (추가)
	          * 뺄셈 연산 시,
	          * 현재 3, 8입력 : -5
	          * 개선 > 8, 3 입력한 값과 같게 : 5
	          * 
	          * 
	          * 2. 학점처리
	          * 사용자에게 점수를 입력받고
	          * 점수에 따라 학점 부여
	          * 사용자가 입력한 점수에 따른 학점 출력
	          * 끝자리 7,8,9면 +붙여주기, C학점 이상만
	          * 90점 이상 A
	          * 80점 이상 B
	          * 70점 이상 C
	          * 그 이하 F
	          * */

	         Scanner sc = new Scanner(System.in);
	         
	         System.out.printf("문제를 선택하세요 %n 1번) 계산기 %n 2번) 학점처리 %n 문제 : ");
	         int choice = sc.nextInt();
	         
	         if(choice == 1) {                                    // 1번 계산기 문제
	            
	            System.out.printf("첫 번째 정수를 입력하세요 : ");
	            int a = sc.nextInt();
	            
	            System.out.printf("두 번째 정수를 입력하세요 : ");
	            int b = sc.nextInt();
	            
	            System.out.printf("연산자를 입력하세요 : ");
	            String c = sc.next();
	            
	            if(c.equals("+")) {
	               System.out.printf("%d %s %d = %d", a, c, b, a+b);
	            } else if(c.equals("-")) {
	               if(a < b) {
	                  int x = a;
	                  a = b;
	                  b = x;
	               }
	               System.out.printf("%d %s %d = %d", a, c, b, a-b);
	            } else if(c.equals("*")) {
	               System.out.printf("%d %s %d = %d", a, c, b, a*b);
	            } else if(c.equals("/")) {
	               System.out.printf("%d %s %d = %d", a, c, b, a/b);
	            } else {
	               System.out.println("입력된 연산자가 올바르지 않습니다.");
	            }
	            
	         } else if(choice == 2) {                           // 2번 학점 처리 문제
	               
	            System.out.printf("점수를 입력하세요 : ");
	            int score = sc.nextInt();
	            char grade;
	            
	            if(score > 100 || score < 0) {
	               System.out.println("점수는 100점~0점 사이로 입력해주세요!");
	            } else {
	               if(score >= 90) {
	                  grade = 'A';
	                  System.out.printf("당신의 학점은 %c입니다.", grade);
	               } else if(score >= 80) {
	                  grade = 'B';
	                  System.out.printf("당신의 학점은 %c입니다.", grade);
	               }else if(score >= 70) {
	                  grade = 'C';
	                  System.out.printf("당신의 학점은 %c입니다.", grade);
	               } else {
	                  grade = 'F';
	                  System.out.printf("당신의 학점은 %c입니다.", grade);
	               }
	            }
	         
	         } else {
	            System.out.println("1번과 2번 중 선택해주세요!!");
	         }
	         sc.close();
