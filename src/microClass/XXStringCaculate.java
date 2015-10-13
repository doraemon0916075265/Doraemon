package microClass;

public class XXStringCaculate {

	public static void main(String[] args) {
		int num01 = 34;
		String str02 = "25";

		int num02 = Integer.parseInt(str02);
		System.out.print("字串 + 數字：");
		System.out.println(num01 + num02);

		String str03 = "3000+200-500+20=";

		int str03Len = str03.length();

		System.out.println("字串長度：" + str03Len);

		int start = 0;
		int end = 10;
		int temp = 0;

		for (int i = 0; i < str03Len; i++) {
			String char03 = str03.substring(i, i + 1);
			try {
				int xxx = Integer.parseInt(char03);
				System.out.println(xxx);
			} catch (Exception e) {
				System.out.println("\t" + i + "\t" + char03);
				start = i;
				temp = Integer.parseInt(str03.substring(0, i));

				if (char03.equals("+") || char03.equals("-") || char03.equals("=")) {

					if (char03.equals("-")) {
						// System.out.println(start + "\t" + end);
						temp = temp - Integer.parseInt(str03.substring(start, end));
					} else {
						// System.out.println(start + "\t" + end);
						temp = temp + Integer.parseInt(str03.substring(start, end));
					}
					start = end;
					System.out.println(temp);
				}
			}
		}
		System.out.println(temp);

	}

}
