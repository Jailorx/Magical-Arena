package src.test.java.utilities;

import src.main.java.constants.AppConstants;
import src.main.java.utilities.RandomNumberGenerator;

public class RandomNumberGeneratorTest {

    public static void main(String[] args) {
        testGenerateNumber();
    }

    public static void testGenerateNumber() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        int upperBound = AppConstants.MAX_DICE_VALUE; 
        int numOfIterations = 1000; 

        for (int i = 0; i < numOfIterations; i++) {
            int randomNumber = randomNumberGenerator.generateNumber(upperBound);
            assert randomNumber >= 1 && randomNumber <= upperBound : "Generated number out of range: " + randomNumber;
        }

        System.out.println("All generated numbers are within the specified range.");
    }
}
