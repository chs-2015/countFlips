/**
 * legendofbacon.tumblr.com
 * lgndofbacon.tumblr.com
 */

public class Coin {
	private final int heads = 0, tails = 1;
	private int face;

	// Set up a coin by flipping it initially
    public Coin() {
    	flip();
    }

    // Flips the coin by randomly choosing a face value
    public void flip() {
    	face = (int)(Math.random() * 2); // I like java.util.Random better but okay
    }

	// Returns true if the current face of the coin is heads
	public boolean isHeads() {
		return (face == heads);
	}

	public String toString() { // oh my god this name is disgusting
		String faceName;
		if (face == heads)
			faceName = "Heads";
		else
			faceName = "Tails";

		return faceName;
	}
}