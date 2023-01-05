package src.hangman;
import java.util.Random;
import java.util.Scanner;

public class words {
    private Random rand = new Random();
    private String words;
    public words() {
        this.words = wordList[rand.nextInt(wordList.length)];
    }
    private String[] wordList = {"coffee", "money", "member", "buyer", "entry", "technology", "instruction",
            "math", "Hangman", "calculator", "phone", "camera", "respect", "garfeild", "aang", "spongebob", "jack",
            "gunk", "sauce", "phlegm", "pneumonoultramicroscopicsilicovolcanoconiosis", "bonkers", "insanity",
            "limit", "fez", "goofy"};

    public String getWords(){
        return words;
    }
    public void setWords(){
        this.words=words;
    }
}

