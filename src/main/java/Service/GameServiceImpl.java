package src.main.java.service;

import src.main.java.models.Player;

/*
 * This interface represents the service for the game functionality
 */

public interface GameServiceImpl {
    /*
     * Initiates the game
     * @param player1 First player
     * @param player2 Second player
     */
    void playGame(Player player1,Player player2);

    /*
     * It simulates rolling a dice
     * @return dice value after rolling
     */
    int rollDice();
    
    /*
     * It applies damage to the player
     * @param player Player object who is defending the attack
     * @param damage Total damage given by attacker to the defender
     */
    void applyDamage(Player player,int damage);
    
}
