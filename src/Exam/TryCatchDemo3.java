package Exam;

public class TryCatchDemo3 {

	public static void main(String[] args) {
		System.out.println("這一行會被執行");
		int i = -2;
		if (i < 0) {
			throw new Error();
		}
		// int ary[] = new int[i];
		System.out.println("這一行不會被執行");
	}

}
