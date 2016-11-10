package app;
import java.util.Random;

/**
 * Part 6
 * 
 * Your task: Reorganize this class so the main is no more than ten lines.
 * 
 * @author cforster
 * 
 */
public class Seaweed {
    
    /**
     * Constants.
     */
    static final int DOZEN = 12;

    /**
     * @param args
     *            command line input (not used)
     */
    public static void main(String[] args) {
	String[] weedTypes = new String[] { "Green", "Brown", "Red", "Mossy", "Fan-Shaped", "Edible", "Fibrous" };
	String[] weedNames = new String[] { "Algae", "Sea Lettuce", "Weed", "Kelp", "Moss" };
	Random gen = new Random();

	// sort the weed types array:
	for (int i = 0; i < weedTypes.length; i++) {
	    for (int j = 0; j < weedTypes.length - 1; j++) {
		if (weedTypes[j].compareToIgnoreCase(weedTypes[j + 1]) < 0) {
		    String temp = weedTypes[j];
		    weedTypes[j] = weedTypes[j + 1];
		    weedTypes[j + 1] = temp;
		}
	    }
	}

	// sort the weedNames array:
	for (int i = 0; i < weedNames.length; i++) {
	    for (int j = 0; j < weedNames.length - 1; j++) {
		if (weedNames[j].compareToIgnoreCase(weedNames[j + 1]) < 0) {
		    String temp = weedNames[j];
		    weedNames[j] = weedNames[j + 1];
		    weedNames[j + 1] = temp;
		}
	    }
	}

	// display all names:
	for (int j = 0; j < weedNames.length; j++) {
	    System.out.print(weedNames[j] + ", ");
	}

	// display random names:
	System.out.println("some random names...");
	for (int j = 0; j < DOZEN; j++) {
	    int type = gen.nextInt(weedTypes.length);
	    int name = gen.nextInt(weedNames.length);
	    String output = weedTypes[type] + " " + weedNames[name];
	    System.out.println(output);
	}

	// display more random names:
	System.out.println("more random names...");
	for (int j = 0; j < DOZEN; j++) {
	    int type = gen.nextInt(weedTypes.length);
	    int name = gen.nextInt(weedNames.length);
	    String output = weedTypes[type] + " " + weedNames[name];
	    System.out.println(output);
	}

    }
}
