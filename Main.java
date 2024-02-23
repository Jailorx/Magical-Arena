import java.util.Random;
import java.util.Scanner;

import src.game.constants.AppConstants;
import src.game.models.Player;

class Main{
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~WELCOME TO MAGICAL ARENA~~~~~~~~~~~~~~~~~~~~~~");
        Scanner sc=new Scanner(System.in);
        System.out.print("Player 1 enter your name: ");
        String name1=sc.next();
        System.out.print("Player 2 enter your name: ");
        String name2=sc.next();

        Random random=new Random();

        int strength1=random.nextInt(AppConstants.MAX_STRENGTH);
        int attack1=random.nextInt(AppConstants.MAX_ATTACK);

        int strength2=random.nextInt(AppConstants.MAX_STRENGTH);
        int attack2=random.nextInt(AppConstants.MAX_ATTACK);

        Player player1 = new Player(name1,strength1,attack1);
        Player player2=new Player(name2,strength2,attack2);

        // System.out.println(player1);
        // System.out.println(player2);
        





    }
}