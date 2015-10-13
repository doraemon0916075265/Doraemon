package microClass;

public class Recursion {
	/** 遞迴函數 **/
	public static int recursion(int num01, int num02) {
		// 比100小就加 num02
		return num01 < 100 ? recursion(num01 += num02, num02) : num01;
	}

	public static void main(String[] args) {
		System.out.println(recursion(11, 5));
	}

}
