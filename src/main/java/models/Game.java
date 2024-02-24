package src.main.java.models;

import src.main.java.service.GameService;
import src.main.java.service.GameServiceImpl;
import src.main.java.utilities.PlayerInfoPrinter;

/*
 * This class represents adding players are to the game 
 */
public class Game {
    private Player[] players;
    private GameServiceImpl service;

    /*
     * Constructs a {@code Game} object
     */
    public Game(Player player1,Player player2)
    {
        this.players=new Player[]{player1,player2};
        service=new GameService();
    }

    /*
     * This function shows the players stats before starting the game
     */
    public void start()
    {
        PlayerInfoPrinter.printPlayerStats(players[0]);
        PlayerInfoPrinter.printPlayerStats(players[1]);
        service.playGame(players[0],players[1]);
    }

    
}
