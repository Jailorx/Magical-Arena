import java.util.Scanner;

import src.game.main.constants.AppConstants;
import src.game.main.models.Game;
import src.game.main.models.Player;
import src.game.main.utilities.RandomNumberGenerator;

class Main{
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~WELCOME TO MAGICAL ARENA~~~~~~~~~~~~~~~~~~~~~~");
        Scanner sc=new Scanner(System.in);
        System.out.print("Player 1 enter your name: ");
        String name1=sc.nextLine();
        System.out.print("Player 2 enter your name: ");
        String name2=sc.nextLine();

        RandomNumberGenerator random=new RandomNumberGenerator();

        int strength1=random.generateNumber(AppConstants.MAX_STRENGTH);
        int attack1=random.generateNumber(AppConstants.MAX_ATTACK);

        int strength2=random.generateNumber(AppConstants.MAX_STRENGTH);
        int attack2=random.generateNumber(AppConstants.MAX_ATTACK);

        Player player1 = new Player(name1,strength1,attack1);
        Player player2=new Player(name2,strength2,attack2);

        Game game=new Game(player1, player2);

        game.start();

    }
}