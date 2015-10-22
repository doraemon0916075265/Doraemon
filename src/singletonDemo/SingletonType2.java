package singletonDemo;

public class SingletonType2 {
	/** Lazy Initialization ; 懶漢方式：指全局的單例實例在第一次被使用時構建 ; 執行緒安全 **/
	// 這種寫法能夠在多線程中很好的工作，而且看起來它也具備很好的lazy loading，但是，遺憾的是，效率很低，99%情況下不需要同步。

	private static SingletonType2 Instance = null;

	private SingletonType2() {

	}

	public synchronized static SingletonType2 getInstance() {
		if (Instance == null) {
			Instance = new SingletonType2();
		}
		return Instance;
	}

}
