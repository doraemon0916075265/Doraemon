package scjp;

public class SCJP005 {

	public static void main(String[] args) {
		int[][] array2D = new int[2][2];
		array2D[0][0] = 1;
		array2D[0][1] = 2;
		array2D[1][0] = 3;
		array2D[1][1] = 4;
		System.out.println(array2D[0][1]);

		int[][][] array3D = new int[2][2][2];
		int[] array = new int[2];
		array3D[0][0] = array;
		array3D[0][1] = array;
		array3D[1][0] = array;
		array3D[1][1] = array;
	}

}
