package singletonDemo;

public class SingletonType5 {
	/** 靜態內部類 **/
	// 這種方式同樣利用了classloder 的機制來保證初始化instance
	// 時只有一個線程，它跟第三種和第四種方式不同的是（很細微的差別）：第三種和第四種方式是只要Singleton 類被裝載了，那麼instance
	// 就會被實例化（沒有達到lazy loading 效果），而這種方式是Singleton 類被裝載了，instance
	// 不一定被初始化。因為SingletonHolder 類沒有被主動使用，只有顯示通過調用getInstance
	// 方法時，才會顯示裝載SingletonHolder 類，從而實例化instance 。想像一下，如果實例化instance
	// 很消耗資源，我想讓他延遲加載，另外一方面，我不希望在Singleton 類加載時就實例化，因為我不能確保Singleton
	// 類還可能在其他的地方被主動使用從而被加載，那麼這個時候實例化instance 顯然是不合適的。這個時候，這種方式相比第三和第四種方式就顯得很合理。

	private static class SingletonHolderType5 {
		private static SingletonType5 Instance = new SingletonType5();
	}

	private SingletonType5() {

	}

	public static final SingletonType5 getInstance() {
		return SingletonHolderType5.Instance;
	}

}
