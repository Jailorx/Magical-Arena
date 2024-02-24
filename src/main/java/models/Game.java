package src.main.java.models;

import src.main.java.Service.GameService;
import src.main.java.Service.GameServiceImpl;
import src.main.java.utilities.PlayerInfoPrinter;

public class Game {
    private Player[] players;
    private GameServiceImpl service;

    public Game(Player player1,Player player2)
    {
        this.players=new Player[]{player1,player2};
        service=new GameService();
    }

    public void start()
    {
        PlayerInfoPrinter.printPlayerStats(players[0]);
        PlayerInfoPrinter.printPlayerStats(players[1]);
        playGame(players[0],players[1]);
    }

    private void playGame(Player attacker,Player defender)
    {
        while (attacker.getHealth() > 0 && defender.getHealth() > 0) {
            System.out.println("Attacker " + attacker.getName() + " rolls the dice");
            int attackerRoll = service.rollDice();
            System.out.println("Defender " + defender.getName() + " rolls the dice");
            int defenderRoll = service.rollDice();

            int attackDamage = attacker.getAttack() * attackerRoll;
            int defenderStrength = defender.getStrength() * defenderRoll;

            System.out.println(attacker.getName() + " has an attack of " + attackDamage);
            System.out.println(defender.getName() + " has a strength of " + defenderStrength);

            int damage = Math.max(0, attackDamage - defenderStrength);
            service.applyDamage(defender, damage);

            
            PlayerInfoPrinter.printScoreCard(attacker);
            PlayerInfoPrinter.printScoreCard(defender);

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        PlayerInfoPrinter.announceWinner(attacker);
    }



    

    
}
