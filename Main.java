import java.util.Scanner;

import src.main.java.constants.AppConstants;
import src.main.java.models.Game;
import src.main.java.models.Player;

class Main{
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~WELCOME TO MAGICAL ARENA~~~~~~~~~~~~~~~~~~~~~~");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Player 1 enter your name: ");
            String name1 = sc.nextLine();

            int strength1,strength2,attack1,attack2;
            
            while (true) {
                System.out.print("Enter strength for "+name1+"  (1-"+AppConstants.MAX_STRENGTH+"): ");
                strength1 = sc.nextInt();
                if (strength1 >= 0 && strength1 <= 10) {
                    break;
                }
                System.out.println("Invalid input. Please enter a value between 1 and 10.");
            }

            while (true) {
                System.out.print("Enter attack for "+name1+" (1-"+AppConstants.MAX_STRENGTH+"): ");
                attack1 = sc.nextInt();
                if (attack1 >= 0 && attack1 <= 10) {
                    break;
                }
                System.out.println("Invalid input. Please enter a value between 1 and 10.");
            }

            sc.nextLine();
            
            System.out.print("Player 2 enter your name: ");
            String name2 = sc.nextLine();

            while (true) {
                System.out.print("Enter strength for "+name2+" (1-"+AppConstants.MAX_STRENGTH+"): ");
                strength2 = sc.nextInt();
                if (strength2 >= 0 && strength2 <= 10) {
                    break;
                }
                System.out.println("Invalid input. Please enter a value between 0 and 10.");
            }

            while (true) {
                System.out.print("Enter attack for "+name2+"  (1-"+AppConstants.MAX_ATTACK+"): ");
                attack2 = sc.nextInt();
                if (attack2 >= 0 && attack2 <= 10) {
                    break;
                }
                System.out.println("Invalid input. Please enter a value between 1 and 10.");
            }



            Player player1 = new Player(name1, strength1, attack1);
            Player player2 = new Player(name2, strength2, attack2);

            Game game = new Game(player1, player2);

            game.start();
        }

    }
}