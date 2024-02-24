package src.main.java.validations;

import java.util.Scanner;

public class InputValidations {

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