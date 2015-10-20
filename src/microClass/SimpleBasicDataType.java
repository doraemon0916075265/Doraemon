package microClass;

import globalService.GlobalValue;

public class SimpleBasicDataType {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();
		System.out.println("char：");
		char c01 = 'A'; // A
		char c02 = '中'; // 中
		char c03 = '\u4E2D'; // Unicode 16進位,中
		char c04 = 20013; // Unicode 10進位,中
		char c05 = 65; // ASCII(65),A
		char c06 = '\0'; // 空字元
		System.out.println(c01 + " " + c02 + " " + c03 + " " + c04 + " " + c05 + " " + c06);
		USE.Demarcation();
		
		
	}

}
