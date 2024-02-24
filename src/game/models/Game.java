package src.game.models;

import java.io.IOException;
import java.util.Random;

import src.game.constants.AppConstants;

public class Game {
    private Player[] players;
    private Random random;

    public Game(Player player1,Player player2)
    {
        this.players=new Player[]{player1,player2};
        random=new Random();
    }
    // public void printPlayers(){
    //     for(Player p:players)
    // System.out.println(p);
    // }
    private int rollDice()
    {
        return 1+random.nextInt(AppConstants.MAX_DICE_VALUE);
    } 

    private void applyDamage(Player player,int damage)
    {
        int totalDamage=player.getHealth()-damage;
        player.setHealth(totalDamage);
    }

    public void start()
    {
        this.printScoreCard(players[0]);
        this.printScoreCard(players[1]);
        this.gameHelper(players[0],players[1]);
    }

    private void gameHelper(Player attacker,Player defender)
    {
        while (attacker.getHealth() > 0 && defender.getHealth() > 0) {
            System.out.println("Attacker " + attacker.getName() + " rolls the dice");
            int attackerRoll = rollDice();
            System.out.println("Defender " + defender.getName() + " rolls the dice");
            int defenderRoll = rollDice();

            int attackDamage = attacker.getAttack() * attackerRoll;
            int defenderStrength = defender.getStrength() * defenderRoll;

            System.out.println(attacker.getName() + " has an attack of " + attackDamage);
            System.out.println(defender.getName() + " has a strength of " + defenderStrength);

            int damage = Math.max(0, attackDamage - defenderStrength);
            applyDamage(defender, damage);

            printScoreCard(attacker);
            printScoreCard(defender);

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        announceWinner(attacker);
    }

    private void announceWinner(Player player)
    {
        System.out.println(player.getName()+" wins!!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~GAME OVER~~~~~~~~~~~~~~~~~~~~~~");
    }

    private void printScoreCard(Player player)
    {
        System.out.println("------"+player.getName()+"-----");
        int health=player.getHealth();
        System.out.println("Health:"+(health<0?0:player.getHealth() ));
        System.out.println("-------------------");
    }


    

    
}
