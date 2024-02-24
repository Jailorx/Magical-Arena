package src.game.main.utilities;

import src.game.main.models.Player;

public class PlayerInfoPrinter {

    static String lineBreak="-------------------";

    public static void announceWinner(Player player)
    {
        System.out.println();
        System.out.println(player.getName()+" wins!!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~GAME OVER~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void printScoreCard(Player player)
    {
        System.out.println(lineBreak);
        System.out.println(player.getName() );
        int health = Math.max(0, player.getHealth());
        System.out.println("Health: " + health);
        System.out.println(lineBreak);
    }

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
