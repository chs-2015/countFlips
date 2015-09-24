/**
 * Author: Brandon B.
 * Date: 9-24-15
 * Description: This program will flip a coin(g! - pfeffer 2015) and count the number of times a heads or tails
 * comes up
 */

public class countFlips {

    public static void main(String[] args) {
		final int numFlips = 1000;
		int heads = 0, tails = 0;

		Coin COINGS = new Coin(); // Instantiate a Coin object

		for (int count = 1;count <= numFlips;count++) {
			COINGS.flip();
			if (COINGS.isHeads())
				heads++;
			else
				tails++;
		}
		System.out.printf("Flips: %d%nHeads: %d%nTails: %d%n", numFlips, heads, tails);
    }
}
