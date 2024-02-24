package src.main.java.utilities;

import java.util.Random;

/*
 * This class represents generating random number
 */

public class RandomNumberGenerator {
    private Random random;
    /*
     * Construct a new {@code RandomNumberGenerator} object
     */
    public RandomNumberGenerator() {
        random = new Random();
    }

    /*
     * It ganerates a random number between 1 and upperBound
     * @param upperBound
     * @return random number between 1 and upperbound;
     */
    public int generateNumber(int upperBound) {
        return 1+random.nextInt(upperBound);
    }

}
