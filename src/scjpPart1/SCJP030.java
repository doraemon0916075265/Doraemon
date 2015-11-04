package scjpPart1;

public class SCJP030 {

	public class Bark {
		abstract class Dog {
			public abstract void bark();
		}

		public class Pooodle extends Dog {
			public void bark() {
				System.out.println("woof");
			}
		}
	}

}
