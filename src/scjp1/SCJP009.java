package scjp1;

public class SCJP009 {

	public static void main(String[] args) {
		int[][] array = { { 0 }, { 0, 1 }, { 0, 2, 4 }, { 0, 3, 6, 9 }, { 0, 4, 8, 12, 16 } };
		System.out.println(array[4][1]);// 4
		System.out.println(array[1][4]);// java.lang.ArrayIndexOutOfBoundsException

		// try {
		// System.out.println(array[1][4]);//
		// java.lang.ArrayIndexOutOfBoundsException
		// } catch (ArrayIndexOutOfBoundsException AIOBE) {
		// System.out.println("AIOBE");
		// AIOBE.printStackTrace();
		// } catch (Exception e) {
		// System.out.println("E");
		// e.printStackTrace();
		// } finally {
		// System.out.println("finally");
		// }
		// System.out.println("out of try-catch");

	}

}
