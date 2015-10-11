package Exam;

public class TryCatchDemo02 {

	public static void main(String[] args) {
		try {
			String[] str = new String[3];
			// System.out.println(str[3]);
			throw new Error();//跑到 Error 後只會跑 finally
		} catch (ArrayIndexOutOfBoundsException xx) {
			System.out.println("array");
		} catch (Exception e) {
			System.out.println("exception");
			e.printStackTrace();
		} finally {
			System.out.println("final");
		}

		System.out.println("outside");
	}

}
