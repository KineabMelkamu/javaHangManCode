package src.theNewHangman;
import java.util.Scanner;
import java.util.Random;


public class meAndMyMonkey {
    Scanner scnr = new Scanner(System.in);
    private Random rand = new Random();

    public static void theHangedMan(int chances) {
        if (chances == 7) {
            System.out.println("|————————————————");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");

        }
        else if (chances == 6){
            System.out.println("|————————————————");
            System.out.println("|        |       ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (chances == 5) {
            System.out.println("|————————————————");
            System.out.println("|        |       ");
            System.out.println("|        0       ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (chances == 4) {
            System.out.println("|————————————————");
            System.out.println("|        |       ");
            System.out.println("|        0       ");
            System.out.println("|        |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(chances == 3) {
            System.out.println("|————————————————");
            System.out.println("|        |       ");
            System.out.println("|        0       ");
            System.out.println("|       /|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (chances == 2) {
            System.out.println("|————————————————");
            System.out.println("|        |       ");
            System.out.println("|        0       ");
            System.out.println("|       /|\\");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (chances == 1) {
            System.out.println("|————————————————");
            System.out.println("|        |       ");
            System.out.println("|        0       ");
            System.out.println("|       /|\\");
            System.out.println("|       /");
            System.out.println("|");
            System.out.println("|");
        }
        else if(chances == 0) {
            System.out.println("|————————————————");
            System.out.println("|        |       ");
            System.out.println("|        0       ");
            System.out.println("|       /|\\");
            System.out.println("|       / \\");
            System.out.println("|");
            System.out.println("|");
        }
    }

    public static String secretWord(){
        Random rand = new Random();
        String [] wordList = {"coffee", "money", "member", "buyer", "entry", "technology", "instruction",
                "math", "Hangman", "calculator", "phone", "camera", "respect", "garfeild", "aang", "spongebob", "jack",
                "gunk", "sauce", "phlegm", "pneumonoultramicroscopicsilicovolcanoconiosis", "bonkers", "insanity",
                "limit", "fez", "goofy"};
        String secretWord = wordList[rand.nextInt(wordList.length)];
        return secretWord;
    }


    public static void main(String [] args){
        System.out.println("Hello! Welcome to hangman! Ready to play? (Enter \"yes\" or \"no\"");
        System.out.println("*******************************************************************");

    }
}
