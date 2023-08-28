package exec_01;

public class remind02 {

	public static void main(String[] args) {
		//task 1
		class Space {
			public void space() {
				System.out.println();
				System.out.printf("/t");
			}
		}

		int i;
		int j;

		String a = "[]";

		for(i = 111; i <= 113; i++) {
			System.out.println(i);
		}for(j = 221; j <= 223; j++) {
			System.out.println(j);
		}

		//task 2
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.printf("[%d,%d]", i , j);
			}
			System.out.println();
		}

		//task 3
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5; ++j) {
				if(i == j) {
					System.out.printf("[%d,%d]", i, j);
				}else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}
	}
}

