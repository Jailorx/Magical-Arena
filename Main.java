import java.util.Random;
import java.util.Scanner;

import src.game.constants.AppConstants;
import src.game.models.Game;
import src.game.models.Player;

class Main{
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~WELCOME TO MAGICAL ARENA~~~~~~~~~~~~~~~~~~~~~~");
        Scanner sc=new Scanner(System.in);
        System.out.print("Player 1 enter your name: ");
        String name1=sc.nextLine();
        System.out.print("Player 2 enter your name: ");
        String name2=sc.nextLine();

        Random random=new Random();

        int strength1=random.nextInt(AppConstants.MAX_STRENGTH+1);
        int attack1=random.nextInt(AppConstants.MAX_ATTACK+1);

        int strength2=random.nextInt(AppConstants.MAX_STRENGTH+1);
        int attack2=random.nextInt(AppConstants.MAX_ATTACK+1);

        // Player player1 = new Player(name1,strength1,attack1);
        // Player player2=new Player(name2,strength2,attack2);
        Player player1 = new Player(name1,5,10);
        Player player2=new Player(name2,10,5);

        // System.out.println(player1);
        // System.out.println(player2);


        Game game=new Game(player1, player2);

        // game.printPlayers();
        game.start();

    }
}