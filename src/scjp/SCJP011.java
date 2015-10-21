package scjp;

import java.io.IOException;

public class SCJP011 {

	public static void main(String[] args) throws IOException {
		try {
			doSomething();
		} catch (RuntimeException e) {
			System.out.println(e);
		}
	}

	static void doSomething() throws IOException {
		if (Math.random() > 0.5)
			throw new IOException();
		throw new RuntimeException();
	}

}
