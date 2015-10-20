package Exam;

public class MultidimensionalArrayDemo01 {

	public static void main(String[] args) {
		/** int[x][y][z] x 個 z * y 的數字 **/
		int[][][] array = new int[10][9][8];

		int counter = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					array[i][j][k] = counter++;
					System.out.print(array[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
