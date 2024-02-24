import java.util.Scanner;

import src.main.java.constants.AppConstants;
import src.main.java.models.Game;
import src.main.java.models.Player;
import src.main.java.validations.InputValidations;

/*
 * This class represents entry point of the Magical Arena Game
 */
class Main{
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~WELCOME TO MAGICAL ARENA~~~~~~~~~~~~~~~~~~~~~~");

        String name1,name2;
        int strength1,strength2,attack1,attack2,health1,health2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Player 1 enter your name: ");
        name1 = sc.nextLine();
            
        System.out.print("Enter strength for "+name1+"  (1-"+AppConstants.MAX_STRENGTH+"): "); 
        strength1=InputValidations.validateInput(sc,1,AppConstants.MAX_STRENGTH);
        System.out.print("Enter attack for "+name1+" (1-"+AppConstants.MAX_ATTACK+"): ");
        attack1 = InputValidations.validateInput(sc,1,AppConstants.MAX_ATTACK); 
        System.out.print("Enter health for "+name1+" (1-"+AppConstants.MAX_HEALTH+"): ");
        health1 = InputValidations.validateInput(sc,1,AppConstants.MAX_HEALTH); 

        sc.nextLine();

        System.out.print("Player 2 enter your name: ");
        name2 = sc.nextLine();

        System.out.print("Enter strength for "+name2+"  (1-"+AppConstants.MAX_STRENGTH+"): "); 
        strength2=InputValidations.validateInput(sc,1,AppConstants.MAX_STRENGTH);

        System.out.print("Enter attack for "+name2+" (1-"+AppConstants.MAX_ATTACK+"): ");
        attack2 = InputValidations.validateInput(sc,1,AppConstants.MAX_ATTACK);
        System.out.print("Enter health for "+name2+" (1-"+AppConstants.MAX_HEALTH+"): ");
        health2 = InputValidations.validateInput(sc,1,AppConstants.MAX_HEALTH);
            
        Player player1 = new Player(name1, strength1, attack1,health1);
        Player player2 = new Player(name2, strength2, attack2,health2); 
        Game game = new Game(player1,player2);
        game.start();
        

    }
}