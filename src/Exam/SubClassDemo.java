package Exam;

public class SubClassDemo extends SuperClassDemo {
	private String name;
	private int number = 100;

	public String getName() {
		return name;
	}

	public void setName(String n) {
		if (n == null || n.trim().length() == 0) {
			name = "無名氏";
		} else {
			name = n;
		}
	}

	public void speak() {
		super.speak();
		System.out.println("我的名字是" + getName());
		System.out.println("sub number = " + number);
	}

}
