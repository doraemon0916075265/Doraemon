package microClass;

public class EqualsDemo {

	public static void main(String[] args) {
		Object a = null;
		Object b = "1";
		try {
			System.out.println(a == b);
			System.out.println(b.equals(a));
			System.out.println(a.equals(b));
		} catch (Exception e) {
			System.out.println("wrong");
			e.printStackTrace();
		}
	}

}
