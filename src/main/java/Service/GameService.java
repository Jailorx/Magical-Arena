package src.main.java.Service;

import src.main.java.constants.AppConstants;
import src.main.java.models.Player;
import src.main.java.utilities.RandomNumberGenerator;

public class GameService implements GameServiceImpl {
    private RandomNumberGenerator random;

    public GameService()
    {
        random=new RandomNumberGenerator();
    }
    public int rollDice()
    {
        return random.generateNumber(AppConstants.MAX_DICE_VALUE);
    } 
    public void applyDamage(Player player,int damage)
    {
        int totalDamage=player.getHealth()-damage;
        player.setHealth(totalDamage);
    }
}
