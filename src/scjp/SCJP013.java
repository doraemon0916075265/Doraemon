package scjp;

public class SCJP013 {

	public static void main(String[] args) {
		SubClass asc = new SubClass();
		SCJP013 sc = new SCJP013();
		// asc = sc;
		sc = asc;// 父類別 = 子類別
		// asc=(Object)sc;
		// asc=sc.clone();
	}

}

class SubClass extends SCJP013 {

}