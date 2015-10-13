package Exam;

public class NumberCountDemo01 {

	public static void main(String[] args) {
		// 給兩個數，比第一個數字小，每個位數的總和是第二個數字

		int num01 = 100;
		int num02 = 5;
		int temp = 0;

		for (int i = 1; i <= num01; i++) {
			String str01 = Integer.toString(i);
			int num01Len = str01.length();
			for (int j = 0; j < num01Len; j++) {
				String tempStr = str01.substring(j, j + 1);
				temp += Integer.parseInt(tempStr);
			}
			if (temp == num02) {
				System.out.println(i);
			}
			temp = 0;
		}

	}

}
