package src.game.main.Service;

import src.game.main.constants.AppConstants;
import src.game.main.models.Player;
import src.game.main.utilities.RandomNumberGenerator;

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
