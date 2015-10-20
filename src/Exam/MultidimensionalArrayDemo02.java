package Exam;

import globalService.GlobalValue;

public class MultidimensionalArrayDemo02 {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();
		int[][] array01 = { { 12, 23, 34 }, { 78, 89, 92, 66, 85 }, { 0 }, { 5, 1 } };

		System.out.print(array01[0][0] + " ");
		System.out.print(array01[0][1] + " ");
		System.out.print(array01[0][2] + " ");

		System.out.print(array01[1][0] + " ");
		System.out.print(array01[1][1] + " ");
		System.out.print(array01[1][2] + " ");
		System.out.print(array01[1][3] + " ");
		System.out.print(array01[1][4] + " ");

		System.out.print(array01[2][0] + " ");

		System.out.println("\narray01.length = " + array01.length);
		System.out.println("array01[0].length = " + array01[0].length);
		System.out.println("array01[1].length = " + array01[1].length);

		USE.Demarcation();
		int[][][] array02 = { { { 11, 12, 13 }, { 54, 55 }, { 99 } }, { { 123, 152 }, { 77, 88, 8 } } };

		System.out.print(array02[0][0][0] + " ");
		System.out.print(array02[0][0][1] + " ");
		System.out.print(array02[0][0][2] + " ");

		System.out.print(array02[0][1][0] + " ");
		System.out.print(array02[0][1][1] + " ");

		System.out.print(array02[1][0][1] + " ");

		System.out.println("\narray02.length = " + array02.length);
		System.out.println("array02[0][0].length = " + array02[0][0].length);

		USE.Demarcation();
	}

}
