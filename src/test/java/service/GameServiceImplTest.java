package src.test.java.service;

import src.main.java.models.Player;
import src.main.java.service.GameServiceImpl;

public class GameServiceImplTest {
    public static void main(String[] args) {
        
        testRollDice();

        
        testApplyDamage();
    }


    public static void testRollDice() {
        GameServiceImpl gameService = new GameServiceImpl();

        int diceRoll = gameService.rollDice();

        System.out.println((diceRoll >= 1 && diceRoll <= 6 )?"Valid dice roll": "Invalid dice roll: " + diceRoll);
    }

    public static void testApplyDamage() {
        Player player = new Player("Player", 10, 5, 100);
        int initialHealth = player.getHealth();

        GameServiceImpl gameService = new GameServiceImpl();

        System.out.println("Health before damage:"+player.getHealth());

        int damage=20;
        gameService.applyDamage(player, damage);

        System.out.println((player.getHealth() == initialHealth - 20)?"Health after damage of "+damage+": "+player.getHealth() : "Incorrect health after damage: " + player.getHealth());
    }
}
