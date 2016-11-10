/**
 * Part 3: Take parameters
 * 
 * Expected output is:
 * 
 * The Giant Snails are invading Miami, Florida.
 * 
 * They collected 78000 african land snails.
 * 
 * There are 1 snails per square foot in Florida.
 * 
 * If that was rhode island, there would be 64 snails per square foot.
 * 
 * @author cforster
 */
public class GiantSnail {
    // DONT MODIFY THIS CODE:

    /**
     * @param args
     *            command line input (not used)
     */
    public static void main(String[] args) {
	invade("Miami, Florida");
	count(78000); // snails
	dense(78000, 65750); // snails, sq ft size of florida
	dense(78000);
    }

    // MODIFY STARTING HERE:
    /**
     * Print an invasion of giant snails based on a location.
     * 
     * @param location
     *            the location of the invasion
     */
    static void invade(String location) {

    }

    /**
     * Prints the number of snails collected.
     * 
     * @param howMany
     *            the number of snails
     */
    static void count(int howMany) {

    }

    /**
     * Print the density of giant snails.
     * 
     * @param howMany
     *            the number of snails
     * @param howLarge
     *            the size of the space they are in
     */
    static void dense(double howMany, double howLarge) {

    }

    /**
     * Prints the density of the giant snails assuming they are in rhode island
     * (1212sq feet).
     * 
     * @param howMany
     *            the number of snails
     */
    static void dense(double howMany) {

    }
}
