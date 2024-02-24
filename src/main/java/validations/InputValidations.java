package src.main.java.validations;

import java.util.Scanner;
/*
 * This class represents validating stats input given by players
 */
public class InputValidations {
    /*
     * It validates the input without given range both are inclusive
     * @param sc   The Scanner object used to read input from the user
     * @param min  The minimum value allowed for input
     * @param max  The maximum value allowed for input 
     * @return     The validated input value within the specified range.
     */
    public static int validateInput(Scanner sc, int min, int max) {
        int input;
        while (true) {
            input = sc.nextInt();
            if (input >= min && input <= max) {
                break;
            }
            System.out.println("Invalid input. Please enter a value between " + min + " and " + max + ".");
        }
        return input;
    }
}