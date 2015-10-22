package singletonDemo;

public class SingletonDemo01 {

	private static SingletonDemo01 uniqueInstance;

	private SingletonDemo01() {
	}

	public static SingletonDemo01 getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonDemo01();
		}
		return uniqueInstance;
	}

}
