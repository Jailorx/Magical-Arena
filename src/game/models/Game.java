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
    private int play()
    {
        return 1+random.nextInt(AppConstants.MAX_DICE_VALUE);
    } 

    private void takeDamage(Player player,int damage)
    {
        int totalDamage=player.getHealth()-damage;
        player.setHealth(totalDamage);
    }

    public void start()
    {
        this.getScoreCard(players[0]);
        this.getScoreCard(players[1]);
        this.gameHelper(players[0],players[1]);
    }

    private void gameHelper(Player p1,Player p2)
    {
        Player attacker=p1;
        Player defender=p2;

        System.out.println("Attacker "+attacker.getName()+" roll the dice");
        int attackerDiceRoll=this.play();
        System.out.println("Defender "+defender.getName()+" roll the dice");
        int defenderDiceRoll= this.play();

        int attackDamage=0;
        int defenderStrength=0;
        try{
            System.in.read();
        attackDamage=attacker.getAttack()*attackerDiceRoll;
        System.out.println(attacker.getName()+" has attack of "+attackDamage);
        System.in.read();
         defenderStrength=defender.getStrength()*defenderDiceRoll;
        System.out.println(defender.getName()+" has strength of "+defenderStrength);
        }catch(IOException io)
        {

        }

        int damage=attackDamage-defenderStrength;

        if(damage>0)
        this.takeDamage(defender,damage);

        this.getScoreCard(attacker);
        this.getScoreCard(defender);

        if(defender.getHealth()<=0)
        {
            this.announceWinner(attacker);
        }
        else
        {   
            
            gameHelper(defender,attacker);
        }
        
    }

    private void announceWinner(Player player)
    {
        System.out.println(player.getName()+" wins!!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~GAME OVER~~~~~~~~~~~~~~~~~~~~~~");
    }

    private void getScoreCard(Player player)
    {
        System.out.println("------"+player.getName()+"-----");
        int health=player.getHealth();
        System.out.println("Health:"+(health<0?0:player.getHealth() ));
        System.out.println("-------------------");
    }


    

    
}
