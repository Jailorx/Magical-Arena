package src.main.java.models;

import src.main.java.constants.AppConstants;
/*
 * This class Represents Player with its attributes
 */
public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name,int strength,int attack,int health)
    {
        this.name=name;
        this.health=health;
        this.strength=strength;
        this.attack=attack;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    
}
