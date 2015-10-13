package microClass;

public class Fibonacci {

	public static void main(String[] args) {
		int fibonacciCount = 20;
		int[] fibonacci = new int[fibonacciCount];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		System.out.println("費波那契數列：");
		for (int i = 0; i < fibonacciCount; i++) {
			System.out.println("F(" + i + ") =\t" + (i >= 2 ? fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2] : fibonacci[i]));
		}
	}
}
