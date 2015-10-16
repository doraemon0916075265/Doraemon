package Exam;

import java.util.HashMap;
import java.util.Map;

public class MapHandle {

	Map<String, Integer> left;
	Map<String, Integer> right;

	public void setUp() {
		left = new HashMap<String, Integer>();
		left.put("a", 1);
		left.put("b", 2);
		left.put("c", 3);

		// left.put("g", 4);
		// left.put("i", 5);
		// left.put("d", 6);

		right = new HashMap<String, Integer>();
		right.put("b", 2);
		right.put("c", 4);
		right.put("d", 5);
	}

	/** 在 Test 內完成 **/
	/** 1. key 一樣 value 不一樣的內容 **/
	/** 2. key 一樣 value 一樣的內容 **/

	/** 3. key 只存 left 不存在 right 的內容 **/
	/** 4. key 只存 right 不存在 left 的內容 **/
	public void Test() {

		/** 0. 全部印出來 **/
		System.out.println("0. 全部印出來");
		System.out.println("函數：\tkey\tvalue");
		for (Object key : left.keySet()) {
			System.out.println("left：\t" + key + "\t" + left.get(key));
		}
		System.out.println();
		for (Object key : right.keySet()) {
			System.out.println("right：\t" + key + "\t" + right.get(key));
		}

		/** 1. key 一樣 value 不一樣的內容 **/
		System.out.println("\n1. key 一樣 value 不一樣的內容");
		for (Object key1 : left.keySet()) {
			if (right.get(key1) != null) {
				if (!right.get(key1).equals(left.get(key1))) {
					System.out.println("left：\t" + key1 + "\t" + left.get(key1));
					System.out.println("right：\t" + key1 + "\t" + right.get(key1));
				}
			}
		}

		/** 2. key 一樣 value 一樣的內容 **/
		System.out.println("\n2. key 一樣 value 一樣的內容");
		for (Object key2 : right.keySet()) {
			if (right.get(key2) != null) {
				if (right.get(key2).equals(left.get(key2))) {
					System.out.println("left：\t" + key2 + "\t" + left.get(key2));
					System.out.println("right：\t" + key2 + "\t" + right.get(key2));
				}
			}
		}

		/** 3. key 只存 left 不存在 right 的內容 **/
		System.out.println("\n3. key 只存 left 不存在 right 的內容");
		for (Object key3 : left.keySet()) {
			if (right.get(key3) == null) {
				System.out.println("left：\t" + key3 + "\t" + left.get(key3));
			}
		}

		/** 4. key 只存 right 不存在 left 的內容 **/
		System.out.println("\n4. key 只存 right 不存在 left 的內容");
		for (Object key4 : right.keySet()) {
			if (left.get(key4) == null) {
				System.out.println("right：\t" + key4 + "\t" + right.get(key4));
			}
		}

	}

	public static void main(String[] args) {
		MapHandle demo = new MapHandle();
		demo.setUp();
		demo.Test();

	}

}
