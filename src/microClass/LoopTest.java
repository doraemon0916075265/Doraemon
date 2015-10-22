package microClass;

import globalService.GlobalValue;

public class LoopTest {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();
		int num01 = 10;

		if (num01 == 10) {// if 敘述內只能放布林結果
			System.out.println("if-ok");
		}
		USE.Demarcation();
		int num02 = 10;
		switch (num02) {// switch-case 敘述內沒有執行到 break 的情況會執行 default
		case 1: {
			System.out.println("1");
		}
		case 5: {
			System.out.println("5");
		}
		case 10: {
			System.out.println("switch-ok");
		}
		case 15: {
			System.out.println("15");
		}
		case 20: {
			System.out.println("20");
		}
		default: {
			System.out.print("switch-");
			System.out.println("default");
			break;
		}
		}
		USE.Demarcation();
		for (int i = 1; i <= 50; i++) {
			if (i % 4 == 0) {
				continue;
			}
			if (i >= 40) {
				break;
			}
			System.out.print(i + " ");
		}

	}

}
