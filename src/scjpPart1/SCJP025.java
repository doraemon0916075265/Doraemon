package scjpPart1;

public class SCJP025 {

	public static void main(String[] args) throws Exception {
		doSomething();
	}

	private static void doSomething() throws Exception {
		System.out.println("Before if clause");
		if (Math.random() > 0.5) {
			System.out.println("if clause");
			throw new Exception();
		}
		System.out.println("After if clause");
	}

}
