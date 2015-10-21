package scjp;

public class SCJP012 {
	String str = "default";

	SCJP012(String s) {
		str = s;
	}

	void print() {
		System.out.println(str);
	}

	public static void main(String[] args) {
		new SCJP012("hello").print();
	}

}
