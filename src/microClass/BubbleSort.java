package microClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import globalService.GlobalValue;

public class BubbleSort {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();
		List<Integer> array = new ArrayList<Integer>();

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
		USE.Demarcation(1);// 1 end
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

		USE.Demarcation(1);// 2 end
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
		USE.Demarcation();
		System.out.println("第二版");
		USE.Demarcation();
		System.out.println("亂數產生的陣列：");

		array = USE.RandomIntegerArray(10, 99, 8);
		int[] numberT1 = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			numberT1[i] = array.get(i);
			System.out.print(array.get(i) + " ");
		}
		System.out.println("\n\n泡沫排序法後的陣列：");
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array.size() - i - 1; j++) {
				if (numberT1[j + 1] < numberT1[j]) {
					int temp1 = numberT1[j + 1];
					numberT1[j + 1] = numberT1[j];
					numberT1[j] = temp1;
				}
			}
		}
		for (int i = 0; i < array.size(); i++) {
			System.out.print(numberT1[i] + " ");
		}
		USE.Demarcation(1);
		System.out.println("亂數產生的陣列：");
		array = USE.RandomIntegerArray(10, 90, 15);
		int[] numberT2 = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			numberT2[i] = array.get(i);
			System.out.print(array.get(i) + " ");
		}
		Arrays.sort(numberT2);
		System.out.println("\n");
		System.out.println("Arrays.sort 排序法後的陣列：");
		for (int i = 0; i < array.size(); i++) {
			System.out.print(numberT2[i] + " ");
		}
		USE.Demarcation(1);

	}

}
