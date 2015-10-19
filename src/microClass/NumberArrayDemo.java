package microClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import globalService.GlobalValue;

public class NumberArrayDemo {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();
		List<Integer> array = new ArrayList<Integer>();
		Set<Integer> arraySet = new HashSet<>();

		Map<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
		int numStart = 10;
		int numEnd = 30;

		array = USE.RandomIntegerArray(numStart, numEnd, 25);
		System.out.println("原本 array = " + array);
		Collections.sort(array);
		System.out.println("排序 array = " + array);

		for (int i = 0; i < array.size(); i++) {
			// 加入Set
			arraySet.add(array.get(i));
		}

		System.out.println("消除重複 = " + arraySet);

		for (int i = numStart; i <= numEnd; i++) {
			int temp = 0;
			if (arraySet.contains(i)) {
				for (int j = 0; j < array.size(); j++) {
					array.get(1);
					if (i == array.get(j)) {
						temp++;
					}
				}
				arrMap.put(i, temp);
			}
		}

		System.out.println(arrMap);
	}

}
