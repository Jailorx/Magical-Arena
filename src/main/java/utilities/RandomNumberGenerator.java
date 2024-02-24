package src.main.java.utilities;

import java.util.Random;

public class RandomNumberGenerator {
    private Random random;

    public RandomNumberGenerator() {
        random = new Random();
    }

    public int generateNumber(int upperBound) {
        return 1+random.nextInt(upperBound);
    }

}
