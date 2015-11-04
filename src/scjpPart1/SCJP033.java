package scjpPart1;

public class SCJP033 {

	public static void main(String[] args) {

		int x = 2;
		int y = 3;
		int z = 4;

		int j = 0, k = 0;
		for (int i = 0; i < x; i++) {
			do {
				k = 0;
				while (k < z) {
					k++;
					System.out.print(k + " ");
				}
				System.out.println();
				j++;
			} while (j < y);
			System.out.println("----");
		}

	}

}
