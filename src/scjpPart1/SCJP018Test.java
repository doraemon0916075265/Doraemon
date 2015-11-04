package scjpPart1;

public class SCJP018Test extends SCJP018 {

	SCJP018Test() {
	}

	private void two() {
		one();
	}

	public static void main(String[] args) {
		new SCJP018Test().two();
	}

}
