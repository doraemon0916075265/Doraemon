package microClass;

public class LottoRandomGenerater {

	public static void main(String[] args) {

		int[] lotto = new int[7];
		int lottoLen = lotto.length;
		int lottoSize = 49;

		System.out.println("樂透產生器：");

		for (int i = 0; i < lottoLen; i++) {
			lotto[i] = (int) (Math.random() * lottoSize + 1);

			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}

		for (int i : lotto) {
			System.out.print(i + " ");
		}
	}

}
