package src.main.java.Service;

import src.main.java.models.Player;

public interface GameServiceImpl {
    int rollDice();
    void applyDamage(Player player,int damage);
}
