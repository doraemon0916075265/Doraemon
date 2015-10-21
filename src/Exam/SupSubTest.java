package Exam;

import globalService.GlobalValue;

public class SupSubTest {

	public static void main(String[] args) {
		GlobalValue USE = new GlobalValue();
		System.out.println("NOTE：繼承可以繼承父類別的屬性和方法，其中屬性可以更改屬性值");
		USE.Demarcation();

		SuperClassDemo father = new SuperClassDemo();
		System.out.println("父類別");
		father.setAge(10);
		father.setWeight(20);
		father.speak();
		USE.Demarcation();

		SubClassDemo son = new SubClassDemo();
		System.out.println("子類別");
		son.setAge(-8);
		son.setWeight(50);
		son.setName("小狗");
		son.speak();

	}

}
