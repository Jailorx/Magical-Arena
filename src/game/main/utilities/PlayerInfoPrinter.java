package src.game.main.utilities;

import src.game.main.models.Player;

public class PlayerInfoPrinter {

    public static void announceWinner(Player player)
    {
        System.out.println();
        System.out.println(player.getName()+" wins!!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~GAME OVER~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void printScoreCard(Player player)
    {
        System.out.println();
        System.out.println("------" + player.getName() + "-----");
        int health = Math.max(0, player.getHealth());
        System.out.println("Health: " + health);
        System.out.println("-------------------");
    }
}
