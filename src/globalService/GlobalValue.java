package globalService;

import java.util.ArrayList;
import java.util.List;

public class GlobalValue {

	private static final String DEMARCATION = "-----------------------------------------------------------------";
	private static final String APPNAME = "叮噹";

	public String getAppName() {
		return APPNAME;
	}
	
	public void Demarcation() {
		// 分隔線
		System.out.println(DEMARCATION);
		return;
	}

	public void Demarcation(int lineHeight) {
		// 分隔線(傳數字)
		if (lineHeight >= 0) {
			for (int i = 0; i < lineHeight; i++) {
				System.out.println();
			}
		}
		System.out.println(DEMARCATION);

		if (lineHeight < 0) {
			for (int i = 0; i > lineHeight; i--) {
				System.out.println();
			}
		}

		return;
	}

	public List<Integer> RandomIntegerArray(int numStart, int numEnd, int arrayCounter) {
		/** 亂數放入 List(起始數字,結束數字,亂數數量) **/
		List<Integer> result = new ArrayList<Integer>();
		int number;
		for (int i = 1; i <= arrayCounter; i++) {
			number = (int) (Math.random() * (numEnd - numStart + 1)) + numStart;
			result.add(number);
		}
		return result;
	}

	public GlobalValue() {
	}

	public static void main(String[] args) {
		GlobalValue gv = new GlobalValue();

		List<Integer> array = new ArrayList<Integer>();
		array = gv.RandomIntegerArray(2, 4, 5);

		for (Integer output : array) {
			System.out.print(output + "\t");
		}
	}

}
