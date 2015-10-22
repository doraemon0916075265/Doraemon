package singletonDemo;

public class SingletonType1 {
	/** Lazy Initialization ; 懶漢方式：指全局的單例實例在第一次被使用時構建 ; 執行緒不安全 **/
	// 這種寫法lazy loading很明顯，但是致命的是在多線程不能正常工作
	private static SingletonType1 Instance = null;

	private SingletonType1() {
	}

	public static SingletonType1 getInstance() {
		if (Instance == null) {
			Instance = new SingletonType1();
		}
		return Instance;
	}

}
