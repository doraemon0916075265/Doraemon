package singletonDemo;

public class SingletonType3 {
	/** 餓漢方式：指全局的單例實例在類裝載時構建 **/
	// 這種方式基於classloder 機制避免了多線程的同步問題，不過，instance
	// 在類裝載時就實例化，雖然導致類裝載的原因有很多種，在單例模式中大多數都是調用getInstance 方法，
	// 但是也不能確定有其他的方式（或者其他的靜態方法）導致類裝載，這時候初始化instance 顯然沒有達到lazy loading 的效果。
	
	private static SingletonType3 Instance = new SingletonType3();

	private SingletonType3() {

	}

	public static SingletonType3 getInstance() {
		return Instance;
	}

}
