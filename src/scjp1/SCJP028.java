package scjp1;

public class SCJP028 {

	public class Test01 {

	}

	static class Test02 {

	}

	class Test03 {

	}

	/** volatile 為屬性修飾字 **/
	// Java 語言中的 volatile 變數可以被看作是一種 "程度較輕的 synchronized"
	private volatile int num;

	/** synchronized 為方法修飾字 **/
	public synchronized String method() {
		return null;
	}

}
