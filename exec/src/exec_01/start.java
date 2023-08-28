package exec_01;

public class start {

	public static void main(String[] args) {
		// System.out.println();
		class Easy {
			public void printScore() {
				System.out.println();
				System.out.println("=-=-=-=-=");
				System.out.println();
			}
		}

		String a = "*";

		// task primary star
		for (int i = 1; i <= 5; i++) {
			System.out.print(a);
		}	
		Easy easy = new Easy();
		easy.printScore();

		// task basic star
		for (int s = 1; s < 5; s++) {
			for(int z = 1; z < 5; z++) {
				System.out.printf(a);
			}
			System.out.println(a);
		}
		Easy easy3 = new Easy();
		easy3.printScore();

		// task ordinary star
		for (int f = 1; f <= 5; f++) {
			for(int g = 1; g <= 5; g++) {
				if(f >= g) {
					System.out.printf(a);
				}
			}
			System.out.println();
		}		
		Easy easy2 = new Easy();
		easy2.printScore();

		// task revert star
		for (int j = 1; j <= 5; j++) {
			for(int k = 1; k <= 5; k++) {
				if(j <= k) {
					System.out.printf(a);
				}
			}
			System.out.println();
		}
		Easy easy4 = new Easy();
		easy4.printScore();
	}

}
