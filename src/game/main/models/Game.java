package src.game.main.models;

import src.game.main.constants.AppConstants;
import src.game.main.utilities.PlayerInfoPrinter;
import src.game.main.utilities.RandomNumberGenerator;

public class Game {
    private Player[] players;
    private RandomNumberGenerator random;

    public Game(Player player1,Player player2)
    {
        this.players=new Player[]{player1,player2};
        random=new RandomNumberGenerator();
    }

    private int rollDice()
    {
        return random.generateNumber(AppConstants.MAX_DICE_VALUE);
    } 

    private void applyDamage(Player player,int damage)
    {
        int totalDamage=player.getHealth()-damage;
        player.setHealth(totalDamage);
    }

    public void start()
    {
        PlayerInfoPrinter.printScoreCard(players[0]);
        PlayerInfoPrinter.printScoreCard(players[1]);
        playGame(players[0],players[1]);
    }

    private void playGame(Player attacker,Player defender)
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

            
            PlayerInfoPrinter.printScoreCard(attacker);
            PlayerInfoPrinter.printScoreCard(defender);

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        PlayerInfoPrinter.announceWinner(attacker);
    }



    

    
}
