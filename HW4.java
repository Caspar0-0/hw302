/**
 * This program is to ask user to enter specific date in 2017, and it will print
 * out the corresponding day in the week and also in year.
 * 
 * @author Caspar Chen
 *
 */
public class HW4 {
	/**
	 * The main class builds a new object and calls numInYear() and dayOfWeek() method.
	 * Display information for users
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Declare a variable
		int dateUserPut;

		// Build a constructor
		Calendar dateInput = new Calendar();

		// Since the numInYear() method gives out the number of days in 2017
		// prior to this date, we need to increase it by 1 for the day in year and
		// store it in dateUserput.
		dateUserPut = dateInput.numInYear() + 1;

		// Displaying information
		System.out.println(
				dateInput + " is day #" + dateUserPut + " of the year; it falls on a " + dateInput.dayOfWeek() + ".");

	}
}