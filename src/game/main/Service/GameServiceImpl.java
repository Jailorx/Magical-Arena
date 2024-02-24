package src.game.main.Service;

import src.game.main.models.Player;

public interface GameServiceImpl {
    int rollDice();
    void applyDamage(Player player,int damage);
}
