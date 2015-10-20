package microClass;

public class LoopTest {

	public static void main(String[] args) {
		int num01 = 10;

		if (num01 == 10) {// if 敘述內只能放布林結果
			System.out.println("if-ok");
		}

		switch (num01) {// switch-case 敘述內沒有執行到 break 的情況會執行 default
		case 1: {
			System.out.println("1");
		}
		case 5: {
			System.out.println("5");
		}
		case 10: {
			System.out.println("switch-ok");
		}
		default:
			System.out.print("switch-");
			System.out.println("default");
			break;
		}

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
