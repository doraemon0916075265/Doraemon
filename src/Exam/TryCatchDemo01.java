package Exam;

public class TryCatchDemo01 {

	public String someException() {

		System.out.println("A");
		
		
		throw new Error();//跑到 Error 後只會跑 finally
		
		
//		int i = 1 / 0;
//		System.out.println("G");
//		return "XXX";
	}

	public static void main(String[] args) {
		try {
			TryCatchDemo01 test01 = new TryCatchDemo01();
			System.out.println("B");
			String str01 = test01.someException();
			System.out.println("C");
			System.out.println(str01);
		} catch (Exception e) {
			System.out.println("D");
			e.printStackTrace();
		} finally {
			System.out.println("E");
		}
		System.out.println("F");
	}

}
