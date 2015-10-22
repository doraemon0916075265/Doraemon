package scjp;

public class SCJP021 {

	public static void main(String[] args) {
		SCJP021 speakIT = new Tell();
		Tell tellIT = new Tell();
		// speakIT.tellItLikeItIs();/* Line 5 */
		// (Truth)speakIT.tellItLikeItIs();/* Line 6 */
		((Truth) speakIT).tellItLikeItIs(); /* Line 7 */
		tellIT.tellItLikeItIs(); /* Line 8 */
		// (Truth)tellIT.tellItLikeItIs(); /* Line 9 */
		((Truth) tellIT).tellItLikeItIs(); /* Line 10 */
	}

}

class Tell extends SCJP021 implements Truth {

	public void tellItLikeItIs() {
		System.out.println("Right on!");
	}

}

interface Truth {
	public void tellItLikeItIs();
};