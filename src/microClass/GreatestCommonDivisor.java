package microClass;

import globalService.GlobalValue;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();

		int[] numbers = new int[2];
		int numLen = numbers.length;
		int randomSize = 30;
		System.out.println("亂數產生的陣列：");
		for (int i = 0; i < numLen; i++) {
			numbers[i] = (int) (Math.random() * randomSize) + 2;
			System.out.print(numbers[i] + " ");
		}
		USE.Demarcation(1);
		System.out.println("最大公因數：" + GCD(numbers[0], numbers[1]));
		System.out.println();
		System.out.println("最小公倍數：" + LCM(numbers[0], numbers[1]));

	}

	public static int GCD(int num1, int num2) {
		// 最大公因數
		return num2 == 0 ? num1 : GCD(num2, num1 % num2);
	}

	public static int LCM(int m, int n) {
		// 最小公倍數
		return m * n / GCD(m, n);
	}

}
