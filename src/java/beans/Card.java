/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


/**
 *
 * @author Nico
 */
public class Card {
    
    private String name;
    private String text;
    private String color1;
    private String color2;
    private int strength;
    private int toughness;
    private int manacost;

    public Card(String cardname, String edition, String type, int manaCost, String rarity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getManacost() {
        return manacost;
    }

    public void setManacost(int manacost) {
        this.manacost = manacost;
    }


    public Card(String name, String text, String color1, String color2, int strength, int toughness, int manacost) {
        this.name = name;
        this.text = text;
        this.color1 = color1;
        this.color2 = color2;
        this.strength = strength;
        this.toughness = toughness;
        this.manacost = manacost;
    }
    
}
