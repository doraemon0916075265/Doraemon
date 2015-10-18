package microClass;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumber {

	public List<Integer> findPrime(int num01, int num02) {

		if (num01 < 2 || num02 < 2 || num01 > num02) {
			return null;
		}

		List<Integer> result = new ArrayList<>();

		for (int num = num01; num <= num02; num++) {
			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				result.add(num);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// 給兩個數(10, 23)，找出這中間的質數

		FindPrimeNumber number = new FindPrimeNumber();
		List<Integer> prime = number.findPrime(2, 100);

		if (!(prime == null)) {
			int count = 0;
			for (Integer result : prime) {
				System.out.println(result);
				count++;
			}
			System.out.println("總共：" + count + "個");
		} else {
			System.out.println("不正確的輸入");
		}

	}

}
