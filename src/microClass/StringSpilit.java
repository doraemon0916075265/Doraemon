package microClass;

import globalService.GlobalValue;

public class StringSpilit {

	public static void main(String[] args) {
		GlobalValue use = new GlobalValue();

		String str1 = "adas asd asdasjioqje kjopdas p54         你好       ads1<<<04d 564a66d65asd044fd6eg0 fgrfhg610";

		String[] str1Array2 = str1.split("a");
		System.out.println("用字串切割(for-each loop)");
		for (String str1bag : str1Array2) {
			System.out.print(str1bag + "|");
		}
		System.out.println();
		use.Demarcation();
		String[] str1Array1 = str1.split("\\s+");
		int str1ArrayAmount = str1Array1.length;

		System.out.println("用正規表示法切割(for-each loop)");
		for (String str1bag : str1Array1) {
			System.out.print(str1bag + "|");
		}
		System.out.println("\n用正規表示法切割(for loop)");
		for (int i = 0; i < str1ArrayAmount; i++) {
			System.out.print(str1Array1[i] + "|");
		}
		System.out.println();
		use.Demarcation();
	}
}
