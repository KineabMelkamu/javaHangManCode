package src.Dice;

import java.util.Random;

public class Dice {
    private int diceSide1, diceSide2;
    
    public Dice() {
        this.diceSide1 = 6;
        this.diceSide2= 6;
    }
    
    public Dice(int sides) {
        if ((sides < 4) || (sides > 20)) {
            this.diceSide1 = 6;
            this.diceSide2 = 6;
        }
        else {
            this.diceSide1 = sides;
            this.diceSide2 = sides;
        }
    }
    public void setDie1(int sides) {
        if ((sides < 4) || (sides > 20)) {
            this.diceSide1 = 6;
        }
        else {
            this.diceSide1 = sides;
        }
    }
    
    public void setDie2(int sides) {
        if ((sides < 4) || (sides > 20)) {
            this.diceSide2 = 6;
        }
        else {
            this.diceSide2 = sides;
        }
    }
    
    public int getDieNum1() {
        Random rand = new Random();
        return rand.nextInt(this.diceSide1) + 1;
    }
    
    public int getDieNum2() {
        Random rand = new Random();			
        return rand.nextInt(this.diceSide2) + 1;
    }
    
    public Dice(int sides1, int sides2) {
        if ((sides1 < 4) || (sides1 > 20)) {
            this.diceSide1 = 6;
        }
        else {
            this.diceSide1 = sides1;
        }
        if ((sides2 < 4) || (sides2 > 20)) {
            this.diceSide2 = 6;
        }
        else {
            this.diceSide2 = sides2;
        }
    }
    
    public String toString() {
        String summary = "";
        
        
        summary += "Die 1 - " + this.diceSide1 + " sides\n" + "Die 2 - " + this.diceSide2 + " sides\n" + "\n"+  (this.diceSide1 * this.diceSide2) + " possible Outcomes\n" + "\n";
        
        for (int i = 1; i <= diceSide1; i++) {
            for (int j = 1; j <= diceSide2; j++) {
                summary += "(" + i + "," + j + ")\t";
            }
            summary += "\n";
        }
        
        
        return summary;
    }
}