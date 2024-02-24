package src.main.java.utilities;

import src.main.java.models.Player;

/*
 * This class represents printing of player data
 */

public class PlayerInfoPrinter {


    static String lineBreak="-------------------";

    /*
     * Announces the player who wins the game
     * @param player Player object who wins the game
     */
    public static void announceWinner(Player player)
    {
        System.out.println();
        System.out.println(player.getName()+" wins!!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~GAME OVER~~~~~~~~~~~~~~~~~~~~~~");
    }

    /*
     * Prints name and remaining health of the player
     * @param player Player object whose scorecard has to be printed
     */
    public static void printScoreCard(Player player)
    {
        System.out.println(lineBreak);
        System.out.println(player.getName() );
        int health = Math.max(0, player.getHealth());
        System.out.println("Health: " + health);
        System.out.println(lineBreak);
    }

    /*
     * Prints stats of the player
     * @param player The player object whose stats has to be printed
     */
    public static void printPlayerStats(Player player)
    {
        System.out.println(lineBreak);
        System.out.println("Name : "+ player.getName());
        System.out.println("Attack : "+ player.getAttack());
        System.out.println("Strength : "+ player.getStrength());
        System.out.println("Health : "+player.getHealth());
        System.out.println(lineBreak);
    }
}
