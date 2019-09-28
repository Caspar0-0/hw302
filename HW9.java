
/*Caspar Chen July 08 2017 */
import java.util.Scanner;

public class HW9 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Scanner scnr2 = new Scanner(System.in);
		// declare and initialize variables
		int numToGuess, numRight;
		int numberOfTries = 0;
		int i = 1;
		String maxNum = "";
		String userAns1 = "";
		String userAns2 = "";
		String restart = "Y";
		boolean a = true;
		boolean b = true;
		boolean win = true;
		boolean empty = true;

		String maxNum_String;

		// loop for a new game when user does not put N or n
		while (restart.charAt(0) != 78 && restart.charAt(0) != 110) {
			a = true;
			b = true;
			empty = true;
			numberOfTries = 0;
			System.out.println("This is game#" + i);
			System.out.print("Enter a max: ");

			// continue only if the input is a valid integer
			while (empty || !isInteger(maxNum)) {
				maxNum_String = scnr2.nextLine();
				if (maxNum_String.length() == 0) {
					empty = true;
					System.out.print("Enter a max: ");
				} else {

					empty = false;
					maxNum = maxNum_String.replaceAll("\\s", "");
					if (!isInteger(maxNum)) {
						System.out.print("Enter a max: ");
					}

				}
			}

			// convert string to integer
			numToGuess = Integer.parseInt(maxNum);

			numRight = (numToGuess - 1) / 2;
			// especial case if user puts max number of 1
			if (numToGuess == 1) {
				System.out.println("In " + numberOfTries + " turn, " + "I have logically "
						+ "deduced based on your responses that your number must be 0");
				win = false;
			}

			else {

				win = true;
				System.out.print("Is my guess of " + numRight + " too Low, too High, or eXact? ");

			}
			// the loop will end when the right number is guessed or inconsistent input.
			while (win) {
				userAns2 = scnr2.nextLine();
				userAns1 = userAns2.replaceAll("\\s", "");

				// check if user hit enter directly or enter spaces 
				if (userAns2.length() == 0 || userAns1.equals("")) {
					System.out.print("Is my guess of " + numRight + " too Low, too High, or eXact? ");
				}

				// if user says the guessing number is lower than his number
				else if (userAns1.charAt(0) == 'L' || userAns1.charAt(0) == 'l') {

					// check if user enters too high before
					if (!a) {
						win = false;
						numberOfTries++;
						System.out.println(
								"This game ended on turn " + numberOfTries + " due to inconsistent user responses");
					} else {
						// check whether the answer can be guessed
						if (numRight + 2 == numToGuess) {
							numRight++;
							numberOfTries++;
							System.out.println("In " + numberOfTries + " turn," + " I have logically "
									+ "deduced based on your responses that your number must be " + numRight);
							win = false;

						} else {
							// continue to guess
							b = false;
							numRight = numRight + 1;
							numberOfTries++;
							System.out.print("Is my guess of " + numRight + " too Low, too High, or eXact? ");
						}
					}
					// if user says the guessing number is higher than his  number
				} else if (userAns1.charAt(0) == 'H' || userAns1.charAt(0) == 'h') {

					// check if user enters too Low before
					if (!b) {
						win = false;
						numberOfTries++;
						System.out.println(
								"This game ended on turn " + numberOfTries + " due to inconsistent user responses");
					} else {
						a = false;
						// if 1 is too high, the answer must be 0, game stop.
						if (numRight == 1) {
							numRight = numRight - 1;
							numberOfTries++;
							System.out.println("In " + numberOfTries + " turn," + " I have logically "
									+ "deduced based on your responses that your number must be " + numRight);
							win = false;
						} else {
							// check whether the answer can be guessed
							if (numRight - 2 == numToGuess) {
								numRight--;
								numberOfTries++;
								System.out.println("In " + numberOfTries + " turn," + " I have logically "
										+ "deduced based on your responses that your number must be " + numRight);
								win = false;

							} else {
								// continue guess, increase guess number and try  by 1
								numRight = numRight - 1;
								numberOfTries++;
								System.out.print("Is my guess of " + numRight + " too Low, too High, or eXact? ");
							}
						}
					}
					// if user says the guessing number is exactly his number
				} else if (userAns1.charAt(0) == 'X' || userAns1.charAt(0) == 'x') {
					numberOfTries++;
					System.out.println("I got lucky and won on turn " + numberOfTries + "!");
					win = false;
				}

				else {

					System.out.print("Is my guess of " + numRight + " too Low, too High, or eXact? ");

				}

			}
			System.out.println("");
			System.out.print("Do you wish to play again (Y/N)? ");
			restart = scnr2.nextLine();
			// make sure get a valid input
			while (restart.length() == 0) {
				System.out.print("Do you wish to play again (Y/N)? ");
				restart = scnr2.nextLine();
			}
			restart = restart.replaceAll("\\s", "");
			System.out.println("");
			i++;

		}
	}

	/**
	 * This method tells us if user puts a valid integer or not
	 * 
	 * @param max
	 *            refers to the string that user puts
	 * @return false if user puts other than 0-9, and it is checking for every
	 *         char, another case is return false for enter 0
	 */

	public static boolean isInteger(String max) {
		//check if the string is null.
		boolean isinteger = true;
		if (max.equals("")) {
			return false;
		}
		//check if the string is 0.	
		if (max.charAt(0) == 48 && max.length() == 1) {
			isinteger = false;
		}
		//check if contains a invalid digit
		for (int i = 0; i < max.length(); i++) {

			if (max.charAt(i) < 48 || max.charAt(i) > 57) {
				isinteger = false;

			}
		}

		return isinteger;

	}
}
