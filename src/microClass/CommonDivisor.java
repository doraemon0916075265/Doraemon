package microClass;

import globalService.GlobalValue;

public class CommonDivisor {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();

		int[] numbers = new int[5];
		int numLen = numbers.length;
		int randomSize = 2000;

		System.out.println("亂數產生的陣列，因數：");
		for (int i = 0; i < numLen; i++) {
			numbers[i] = (int) (Math.random() * randomSize) + 2;
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		USE.Demarcation();

		int temp = numbers[0];
		for (int i = 0; i < numLen; i++) {
			if (Math.max(numbers[i], temp) == numbers[i]) {
				temp = numbers[i];
			}
			// System.out.println("max = " + temp);// 抓取目前陣列中最大的數值
			System.out.print(numbers[i] + "：");
			for (int j = 1; j <= temp; j++) {
				if (numbers[i] % j == 0) {
					System.out.print(j + " ");
				}
			}

			System.out.println();
		}

	}

}
