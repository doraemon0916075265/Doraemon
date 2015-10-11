package Exam;

public class SuperClassDemo {
	/** 動物 **/
	private int age;
	private int weight;
	private int number = 10;

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		if (a < 0) {
			age = 1;
		} else {
			age = a;
		}
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int w) {
		if (w < 0) {
			weight = 1;
		} else {
			weight = w;
		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void speak() {
		System.out.println("哈囉，我已經" + getAge() + "歲，有" + getWeight() + "公斤重");
		System.out.println("super number = " + number);
	}
}
