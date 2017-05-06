
/**
 * The DigitFormatException class is for when
 * a user tries to input a non numeric value
 * <br><br>
 * @author Allen McDermott
 * @since 10/15/14
 */

public class DigitFormatException extends Exception {
	
	//message to tell the user when they trigger this exception
	private String message = "DigitFormatException: can only enter numeric values";

	//getMessage() returns a string message
 	//@return message from variable message 
	public String getMessage() {
		return message;
	}
} 
