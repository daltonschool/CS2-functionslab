import java.util.Random;

/**
 * Part 2
 * 
 * Expected Output:
 * 
 * The scientific name for the sea cucumber is Holothuroidea.
 * 
 * There are 1250 species of sea cucumber.
 * 
 * My favorite type is the warty sea cucumber.
 * 
 * I have 239 sea cucumbers in my pond.
 * 
 * My favorite sea cucumber song is Ode to the Cucumber.
 * 
 * @author cforster
 */
public class SeaCucumbers {
    // DONT MODIFY THIS CODE:
    /**
     * @param args
     *            command line input (not used)
     */
    public static void main(String[] args) {
	System.out.print("The scientific name for the sea cucumber is ");
	science();

	System.out.print("There are " + species() + " species of sea cucumber.");

	System.out.println("My favorite type is the " + warty() + " sea cucumber.");

	System.out.println("I have " + rando().nextInt(500) + " sea cucumbers in my pond.");

	System.out.println("My favorite sea cucumber song is " + song()[2] + ".");
    }

    /*
     * MODIFY THIS CODE:
     */

    /**
     * Display a scientific name.
     */
    public static void science() {

    }

    /**
     * @return number of species
     */
    public static int species() {
	return 0;
    }

    /**
     * @return the word "warty"
     */
    public static String warty() {
	return null;
    }

    /**
     * @return a random number
     */
    public static Random rando() {
	return null;
    }

    /**
     * @return a String array
     */
    public static String[] song() {
	return null;
    }
}
