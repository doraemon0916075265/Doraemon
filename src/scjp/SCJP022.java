package scjp;

public class SCJP022 {

	public static void main(String[] args) {
		String h1 = "Bob";
		String h2 = new String("Bob");

		if (h1 == h2) {
			System.out.println("h1 == h2");
		} else {
			System.out.println("h1 == h2 fail");
		}

		if (h1.equals(h2)) {
			System.out.println("h1.equals(h2)");
		} else {
			System.out.println("h1.equals(h2) fail");
		}

	}

}
