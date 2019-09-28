
import java.util.Random;

/**
 * This program is to print two dice with one has default color, material, and
 * number of sides already set, and other one three fields set in the main class
 * Also, for the number that we roll for the dice, it is randomly produced.
 * 
 * @author Caspar Chen
 *
 */
public class Dice {
	/**
	 * The integer number of sides of a dice
	 */
	private int numSides;
	/**
	 * the string name of material of a dice
	 */
	private String material;
	/**
	 * the string name of color of a dice
	 */
	private String color;

	public Dice() {
		numSides = 6;
		material = "plastic";
		color = "white";
		Random rollDier = new Random();
	}

	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}

	public int getSides() {
		return numSides;
	}

	public void setColor(String userColor) {
		this.color = userColor;
	}

	public void setMaterial(String userMaterial) {
		this.material = userMaterial;

	}

	public void setSides(int userSides) {
		this.numSides = userSides;

	}

	/**
	 * @return a string representation of material, color, and number of sides of dice the main class set for
	 */
	public String toString() {
		return "This is a " + material + ", " + color + " " + numSides + "-sided die";

	}
/**
 * This rollDie() method is used to generate random number that a dice whose number of sides the main class sets can roll
 * First, create a Random number generator object named rollDier.
 * Then, the method call rollDier.nextInt(numSides) + 1) can then be used to get a random integer ranging from 1 to the number of sides of dice. 
 * @return a random integer ranging from 1 to the number of sides of dice that the main class sets
 */
	public int rollDie() {
		
		return rollDier.nextInt(numSides) + 1;
	}

}
