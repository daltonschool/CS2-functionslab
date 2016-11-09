import java.util.Random;

/**
 * 
 * @author cforster
 * 
 *         Part 1
 * 
 *         expected output:
 * 
 *         Moon jelly is the most common of the jelly fish
 * 
 *         The white spotted jellyfish has phosphorescent dots
 * 
 *         The lion's mane jellyfish is 6ft in diameter and 100 feet long.
 * 
 *         The Australian Sea Wasp killed you!
 * 
 *         **the last line should be "did not kill you" based on the function's
 *         value
 *
 */
public class Jellyfish {
    // MODIFY THIS CODE:
    /**
     * 
     * @param args
     *            - command line input (not used)
     */
    public static void main(String[] args) {

    }

    /*
     * DONT MODIFY THIS CODE:
     */
    /**
     * @return - A string about moon jelly.
     */
    static String moonJelly() {
	return "Moon jelly is the most common of the jelly fish";
    }

    /**
     * Display text about white spotted jellyfish.
     */
    static void whiteSpot() {
	System.out.println("The white spotted jellyfish has phosphorescent dots");
    }

    /**
     * @param length - How long in feet
     * @return - A String about the lions mane
     */
    static String lionsMane(int length) {
	return "The lion's mane jellyfish is 6ft in diameter and " + length + " feet long.";
    }

    /**
     * @return - if it's an Australian Sea Wasp
     */
    static boolean isAustralianSeaWasp() {
	Random gen = new Random();
	return gen.nextBoolean();
    }
}
