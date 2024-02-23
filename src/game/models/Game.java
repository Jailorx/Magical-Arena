package src.game.models;

import java.util.Random;

public class Game {
    private Player[] players;
    private int currentPlayer;
    private Random random;

    public Game(Player player1,Player player2)
    {
        this.players=new Player[]{player1,player2};
    }

    
}
