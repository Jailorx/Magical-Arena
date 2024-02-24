package src.main.java.models;

import src.main.java.service.GameService;
import src.main.java.service.GameServiceImpl;
import src.main.java.utilities.PlayerInfoPrinter;

/*
 * This class represents adding players are to the game 
 */
public class Game {
    private Player[] players;
    private GameService service;

    /*
     * Constructs a {@code Game} object
     */
    public Game(Player player1,Player player2)
    {
        this.players=new Player[]{player1,player2};
        this.service=new GameServiceImpl();
        
    }

    /*
     * This function shows the players stats before starting the game
     */
    public void start()
    {
        PlayerInfoPrinter.printPlayerStats(players[0]);
        PlayerInfoPrinter.printPlayerStats(players[1]);

        Player attacker, defender;

        // Determine attacker and defender based on health points
        if (players[1].getHealth() > players[0].getHealth()) {
            attacker = players[0];
            defender = players[1];
        } else {
            attacker = players[1];
            defender = players[0];
        }

        // Start the game with the determined attacker and defender
        service.playGame(attacker, defender);
    }

    
}
