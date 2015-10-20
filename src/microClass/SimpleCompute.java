package microClass;

import globalService.GlobalValue;

public class SimpleCompute {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();
		int num01;

		num01 = 10;
		System.out.println(num01 + "\t" + (num01++) + "\t" + num01);// 先印在加

		num01 = 10;
		System.out.println(num01 + "\t" + (++num01) + "\t" + num01);// 先加再印

		num01 = 10;
		System.out.println(num01 + "\t" + (num01 += 5) + "\t" + num01);// 先加再印

		USE.Demarcation();

		int num02 = 0;
		int num03 = 0;
		num03 = (num02++) + (++num02) - (num02++);
		System.out.println("num02 = " + num02 + " , num03 = " + num03);



	}

}
