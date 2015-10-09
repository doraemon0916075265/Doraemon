package Exam;

import globalService.GlobalValue;

public class BubbleSort {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();

		int[] numbers = new int[10];
		int numLen = numbers.length;

		System.out.println("亂數產生的陣列：");
		for (int i = 0; i < numLen; i++) {
			numbers[i] = (int) (Math.random() * 100);
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
		USE.Demarcation();
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
		USE.Demarcation();
		System.out.println("API");

	}

}
