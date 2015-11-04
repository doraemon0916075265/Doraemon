package scjpPart1;

import globalService.GlobalValue;

public class SCJP002Test {

	public static void main(String[] args) {

		GlobalValue USE = new GlobalValue();
		SCJP002 bob = new SCJP002();
		SCJP002 jian = new SCJP002();

		jian = bob;
		System.out.println("Bob's\tName : " + bob.name + "\t" + "Jian's Name : " + jian.name);
		System.out.println("Bob's\tAge : " + bob.age + "\t" + "Jian's Age : " + jian.age);
		System.out.println("Bob's\tMajor : " + bob.major + "\t" + "Jian's Major : " + jian.major);
		USE.Demarcation();
		bob.name = "Bob";
		System.out.println("Bob's\tName : " + bob.name + "\t" + "Jian's Name : " + jian.name);
		System.out.println("Bob's\tAge : " + bob.age + "\t" + "Jian's Age : " + jian.age);
		System.out.println("Bob's\tMajor : " + bob.major + "\t" + "Jian's Major : " + jian.major);
		USE.Demarcation();
		jian.major="XXX";
		bob.age = 19;
		System.out.println("Bob's\tName : " + bob.name + "\t" + "Jian's Name : " + jian.name);
		System.out.println("Bob's\tAge : " + bob.age + "\t" + "Jian's Age : " + jian.age);
		System.out.println("Bob's\tMajor : " + bob.major + "\t" + "Jian's Major : " + jian.major);
		USE.Demarcation();
//		jian = bob;
		System.out.println("Bob's\tName : " + bob.name + "\t" + "Jian's Name : " + jian.name);
		System.out.println("Bob's\tAge : " + bob.age + "\t" + "Jian's Age : " + jian.age);
		System.out.println("Bob's\tMajor : " + bob.major + "\t" + "Jian's Major : " + jian.major);
		USE.Demarcation();
		jian.age = 27;
		jian.name = "Jian";
		System.out.println("Bob's\tName : " + bob.name + "\t" + "Jian's Name : " + jian.name);
		System.out.println("Bob's\tAge : " + bob.age + "\t" + "Jian's Age : " + jian.age);
		System.out.println("Bob's\tMajor : " + bob.major + "\t" + "Jian's Major : " + jian.major);
	}

}
