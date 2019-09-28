
/*Caspar Chen July 05 2017 */
import java.util.Scanner;

public class HW6 {
	public static void main(String[] args) {
		// Declare and initialize variables
		String userword1 = "";
		String userword2 = "";
		String userword3 = "";
		
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("enter three or more words separated by a single space: ");
		//Store inputs from user
		userword1 = scnr.next();
		userword2 = scnr.next();
		userword3 = scnr.nextLine();

		System.out.println("Before changing, the first letter was " + "\"" + userword1.charAt(0) + "\""
				+ ", and the last letter was " + "\"" + userword3.charAt(userword3.length() - 1) + "\"");
		System.out.println("After change: " + userword1.toUpperCase() + " " + userword2.toLowerCase() + userword3);
		scnr.close();
	}
}