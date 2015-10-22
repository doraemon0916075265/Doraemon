package singletonDemo;

public class SingletonType4 {
	/** 餓漢方式：指全局的單例實例在類裝載時構建 ; 變種 **/
	// 表面上看起來差別挺大，其實更第三種方式差不多，都是在類初始化即實例化instance。

	private static SingletonType4 Instance = null;

	static {
		Instance = new SingletonType4();
	}

	private SingletonType4() {

	}

	public static SingletonType4 getInstance() {
		return Instance;
	}

}
