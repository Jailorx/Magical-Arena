package src.main.java.service;

import java.io.IOException;

import src.main.java.constants.AppConstants;
import src.main.java.models.Player;
import src.main.java.utilities.PlayerInfoPrinter;
import src.main.java.utilities.RandomNumberGenerator;

/*
 * This class implements {@code GameServiceImpl} interface
 */

public class GameServiceImpl implements GameService {
    private RandomNumberGenerator random;
    private int rounds;
    /**
     * Constructs a new {@code GameServiceImpl} object.
     */
    public GameServiceImpl()
    {
        this.random=new RandomNumberGenerator();
        this.rounds=1;
    }
     
    @Override
    public void playGame(Player attacker,Player defender)
    {
        try{     
            boolean newRound=true;   
            while (attacker.getHealth() > 0 && defender.getHealth() > 0) {
                if(newRound)
                {
                    System.out.println("Begin round "+rounds);
                    System.out.println("Press Enter to Begin...");
                }
        
                System.in.read();

                System.out.println("Attacker " + attacker.getName() + " rolls the dice");
                int attackerRoll = rollDice();
                int attackDamage = attacker.getAttack() * attackerRoll;
                System.out.println(attacker.getName() + " has an attack of " + attackDamage);

                System.out.println();
                
                System.out.println("Defender " + defender.getName() + " rolls the dice");
                int defenderRoll = rollDice();
                int defenderStrength = defender.getStrength() * defenderRoll;
                System.out.println(defender.getName() + " has a strength of " + defenderStrength);

                int damage = Math.max(0, attackDamage - defenderStrength);
                applyDamage(defender, damage);

                
                PlayerInfoPrinter.printScoreCard(attacker);
                PlayerInfoPrinter.printScoreCard(defender);

                if(defender.getHealth()<=0)
                PlayerInfoPrinter.announceWinner(attacker);

                Player temp = attacker;
                attacker = defender;
                defender = temp;
                
                newRound = !newRound;

        
                if (newRound) {
                    rounds++;
                }
            }     
    }catch(IOException io){
        System.out.println("exception occured:"+io.getMessage());
        }   
    }

    @Override
    public int rollDice()
    {
        return random.generateNumber(AppConstants.MAX_DICE_VALUE);
    } 

    @Override
    public void applyDamage(Player player,int damage)
    {
        int totalDamage=player.getHealth()-damage;
        player.setHealth(totalDamage);
    }
   
}
