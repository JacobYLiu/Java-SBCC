/**
 * CS 105 Theory & Practice I
 * CRN: 38063
 * Assignment: AtmPin
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Jacob Liu
 */
import java.util.Scanner;

public class AtmPin {
	public enum PinValidationResult {
	    UNLOCKED_PIN_CORRECT,
	    UNLOCKED_PIN_INCORRECT,
	    LOCKED
	};
	public static PinValidationResult validatePin(String pin, int incorrectCount) {
		int code = Integer.parseInt(pin.substring(0, pin.length()-1));
		int length = pin.length();
		return "Code unlocked";
	};
	public static void main(String[] args) {
		System.out.print("Enter your pin code: "); // asking the user for the integer
		Scanner in = new Scanner(System.in); //scanning the input
		String pin = in.nextLine();
	};

}
