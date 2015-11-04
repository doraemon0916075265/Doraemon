package scjp1;

public class SCJP004 {
	int z = 10;

	public static void main(String[] args) {
		SCJP004 myScope = new SCJP004();
		System.out.print("T" + myScope.z + "\t");

		int z = 6;
		System.out.print(z + "\t");// 1
		myScope.doStuff();
		System.out.print(z + "\t");// 3
		System.out.print(myScope.z + "\t");// 4
	}

	void doStuff() {
		int z = 5;
		doStuff2();
		System.out.print(z + "\t");// 2
	}

	void doStuff2() {
		z = 4;
	}

}
