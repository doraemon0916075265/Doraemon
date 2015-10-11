package microClass;

import java.util.Arrays;

import globalService.GlobalValue;

public class BubbleSort {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();

		int[] numbers = new int[15];
		int numLen = numbers.length;
		int randomSize = 100;

		System.out.println("亂數產生的陣列：");
		for (int i = 0; i < numLen; i++) {
			numbers[i] = (int) (Math.random() * randomSize);
			System.out.print(numbers[i] + " ");
		}

		System.out.println("\n");
		System.out.println("泡沫排序法後的陣列：");
		for (int i = 0; i < numLen; i++) {
			for (int j = 0; j < numLen - i - 1; j++) {
				if (numbers[j + 1] < numbers[j]) {
					int temp = numbers[j + 1];
					numbers[j + 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int i = 0; i < numLen; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		USE.Demarcation();// 1 end
		System.out.println("亂數產生的陣列：");
		for (int i = 0; i < numLen; i++) {
			numbers[i] = (int) (Math.random() * randomSize);
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n");
		System.out.println("Arrays.sort 排序法後的陣列：");

		Arrays.sort(numbers);
		for (int i = 0; i < numLen; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		for (int i = numLen - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
		USE.Demarcation();// 2 end
		System.out.println("亂數產生的陣列：");
		for (int i = 0; i < numLen; i++) {
			numbers[i] = (int) (Math.random() * randomSize);
			System.out.print(numbers[i] + " ");
		}
		System.out.println("\n");
		System.out.println("排序法後的陣列：");
		int temp = numbers[0];
		for (int i = 0; i < numLen - 1; i++) {
			int maxNum = numbers[i + 1];

			if (Math.max(maxNum, temp) == maxNum) {
				temp = maxNum;
			}

		}
		System.out.println(temp);

	}

}
