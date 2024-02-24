package src.game.main.utilities;

import java.util.Random;

public class RandomNumberGenerator {
    private Random random;

    public RandomNumberGenerator() {
        random = new Random();
    }

    public int generateNumber(int upperBound) {
        return random.nextInt(upperBound + 1);
    }

}
