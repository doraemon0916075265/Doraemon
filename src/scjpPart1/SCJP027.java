package scjpPart1;

public class SCJP027 {

	public static void main(String[] args) {

		String color = "Red";

		switch (color) {
		case "Red": {
			System.out.println("Found Red");
		}
		case "Blue": {
			System.out.println("Found Blue");
			break;
		}
		case "White": {
			System.out.println("Found White");
			break;
		}
		default: {
			System.out.println("Found Defalt");
		}
		}
	}

}
