package scjp1;

public class SCJP015 {
	class Base1 {
		abstract class Abs1 {
		}
	}

	abstract class Abs2 {
		void doit() {
		}
	}

	class Base3 {
		abstract class Abs3 extends Base3 {
		}
	}
	private int var4=89;
}
