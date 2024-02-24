package src.test.java.models;

import src.main.java.models.*;

public class PlayerTest {
    public static void main(String[] args) {
        
        Player player = new Player("John",10 , 7, 90);
        
        // Test getName method
        System.out.println("Player name: " + player.getName());
        // Test getHealth method
        System.out.println("Player health: " + player.getHealth());
        // Test getStrength method
        System.out.println("Player strength: " + player.getStrength());
        // Test getAttack method
        System.out.println("Player attack: " + player.getAttack());
        
        // Modify player attributes and test setters
        player.setName("Doe");
        player.setHealth(80);
        
        // Test modified attributes
        System.out.println("Modified player name: " + player.getName());
        System.out.println("Modified player health: " + player.getHealth());

        //Modify player by setting it empty
        player.setName("");
        System.out.println("Empty name string: "+player.getName());
        // Test setting negative health
        player.setHealth(-10);
        System.out.println("Player health after setting negative value: " + player.getHealth());
        
        // Test setting negative strength
        System.out.println("Player strength after setting negative value: " + player.getStrength());
        
        // Test setting negative attack
        System.out.println("Player attack after setting negative value: " + player.getAttack());
        
        // Test setting null name
        player.setName(null);
        System.out.println("Player name after setting null value: " + player.getName());
        
        // Test setting very large values
        player.setHealth(Integer.MAX_VALUE);
        
        System.out.println("Player health after setting very large value: " + player.getHealth());
        
    }
}

