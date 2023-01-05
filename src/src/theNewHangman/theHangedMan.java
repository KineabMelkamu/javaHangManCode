package src.theNewHangman;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class theHangedMan {
    private static String[] wordList = {"butter", "abyss", "button", "game", "hangman", "hydrogen", "distribution", "parasite", "paradox", "zebra", "yellow", "spring", "woman", "winter", "transportation", "education", "disestablishmentarianism", "pneumonoultramicroscopicsilicovolcanoconiosis", "stocking", "stomach", "blackberry", "xenobiotic", "xenomorph", "portrayal", "betrayal", "romance", "marriage", "divorce", "capybara", "calculus", "representative", "political", "porter", "crystal", "jewelry", "pensive", "vacuum", "ventriloquist", "queen", "queue", "commander", "violet", "violence", "waterfall", "wednesday", "mountain", "feast", "shoebill", "waitress", "dopamine"};
    private static ArrayList<String> guessedLetters = new ArrayList<String>();
    private static Random rand = new Random();
    private static Scanner scnr = new Scanner(System.in);
    private static int chances = 6;

    private static String wordToGuess = wordList[rand.nextInt(wordList.length)];
    private static ArrayList<String> lettersToGuess = new ArrayList<String>();
    private static ArrayList<String> underscores = new ArrayList<String>();
    private static String userGuess;



    public static void theHangedMan(int glusses) {
        if (chances == 7) {
            System.out.println("|—————————————————");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (chances == 6) {
            System.out.println("|—————————————————");
            System.out.println("|        |        ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (chances == 5) {
            System.out.println("|—————————————————");
            System.out.println("|        |        ");
            System.out.println("|        0        ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (chances == 4){
            System.out.println("|—————————————————");
            System.out.println("|        |        ");
            System.out.println("|        0        ");
            System.out.println("|        |        ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (chances == 3){
            System.out.println("|—————————————————");
            System.out.println("|        |        ");
            System.out.println("|        0        ");
            System.out.println("|       /|        ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if(chances == 2) {
            System.out.println("|—————————————————");
            System.out.println("|        |        ");
            System.out.println("|        0      ");
            System.out.println("|       /|\\      ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
        }
        else if (chances == 1) {
            System.out.println("|—————————————————");
            System.out.println("|        |        ");
            System.out.println("|        0      ");
            System.out.println("|       /|\\     ");
            System.out.println("|       /");
            System.out.println("|");
            System.out.println("|");

        }
        else if (chances == 0) {
            System.out.println("|—————————————————");
            System.out.println("|        |        ");
            System.out.println("|        0      ");
            System.out.println("|       /|\\     ");
            System.out.println("|       / \\");
            System.out.println("|");
            System.out.println("|");

        }
    }

    public static void winAscii(){
        System.out.println("        __ooooooooo__\n" +
                "              oOOOOOOOOOOOOOOOOOOOOOo\n" +
                "          oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\n" +
                "       oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\n" +
                "     oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\n" +
                "   oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\n" +
                "  oOOOOOOOOOOO*  *OOOOOOOOOOOOOO*  *OOOOOOOOOOOOo\n" +
                " oOOOOOOOOOOO      OOOOOOOOOOOO      OOOOOOOOOOOOo\n" +
                " oOOOOOOOOOOOOo  oOOOOOOOOOOOOOOo  oOOOOOOOOOOOOOo\n" +
                "oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo\n" +
                "oOOOO     OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO     OOOOo\n" +
                "oOOOOOO OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO OOOOOOo\n" +
                " *OOOOO  OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  OOOOO*\n" +
                " *OOOOOO  *OOOOOOOOOOOOOOOOOOOOOOOOOOOOO*  OOOOOO*\n" +
                "  *OOOOOO  *OOOOOOOOOOOOOOOOOOOOOOOOOOO*  OOOOOO*\n" +
                "   *OOOOOOo  *OOOOOOOOOOOOOOOOOOOOOOO*  oOOOOOO*\n" +
                "     *OOOOOOOo  *OOOOOOOOOOOOOOOOO*  oOOOOOOO*\n" +
                "       *OOOOOOOOo  *OOOOOOOOOOO*  oOOOOOOOO*      \n" +
                "          *OOOOOOOOo           oOOOOOOOO*      \n" +
                "              *OOOOOOOOOOOOOOOOOOOOO*          \n" +
                "                   \"\"ooooooooo\"\"");
    }

    public static void looseAscii(){
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡯⠁⢸⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢸⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⡻⣷⠀⠀⠀⠈⢿⡩⣿⡿⣿⣻⣿⣛⣃⣀⠀⢸⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⢸⣿⣿⣿⣿⣿⡿⣯⡀⠀⠈⠽⣿⣇⣀⣤⡤⠾⠗⠚⠛⠛⠋⠹⠍⠛⣛⣳⣾⣿⣿⣿⣀⣀⣀⣀⣀⣀⣐⣒⣀⡠⢤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣸⣖⣒⣲⣶⢤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠛⠛⠉⠹⣿⣿⣿⣯⣽⣷⣀⣴⠟⠋⠉⠀⠀⠀⠰⠤⣶⣀⠰⣄⡀⠀⠀⠈⣉⣞⣻⣿⠉⠉⠉⠉⠁⠀⠀⠚⠿⠭⣽⣓⣿⣽⣷⣦⣄⡀⠀⠀⠀⣠⣴⣞⣿⣿⣿⣟⡻⢦⣿⠿⢭⣟⠺⣿⡷⣤⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠛⠿⠶⣤⣄⠀⠀⠀⠈⠉⠋⣿⢿⣿⠿⠃⠀⠀⠀⠀⠀⠀⠙⠛⢿⣷⣿⡶⠞⠛⠋⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠐⠶⠶⠬⣭⣳⣯⣟⣿⣟⣦⣤⣾⣿⣿⡟⠉⠉⠛⢿⣿⣶⡹⣷⡲⣬⡛⢦⡙⢮⡳⣄⠀⠀⠀⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⠉⠀⠀⠀⠀⠀⠀⠉⠈⠀⠀⠀⠀⠀⣾⡃⡾⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠂⢯⣝⠻⢿⣿⣿⣿⣿⣿⣿⡄⠀⠀⣠⣾⣿⣿⣷⣿⡟⠳⣍⠳⣝⣮⣳⡹⡆⠀⠀⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣫⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⡟⢁⣐⣶⣶⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠿⣟⣶⣽⣿⡇⣿⣿⣿⣿⣄⣴⣿⣿⣿⣿⣯⣿⣥⡀⠈⠑⣜⢯⣷⣷⢹⡀⠀⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⡵⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⣤⣴⣾⣿⣿⣷⣶⢀⣿⣾⣿⣿⣿⣿⣛⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢩⣼⣻⣿⣿⣿⣿⣿⣯⣿⣿⣿⣿⡿⣿⣯⠳⣝⣦⠀⠘⣎⢻⡽⣯⡇⠀⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⣠⡴⠖⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡞⣁⠀⠀⠀⣤⣶⠛⠛⣿⣿⣿⠻⣿⣿⠿⠙⠉⠉⠀⠀⠀⠒⣿⣧⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣴⣿⡿⣟⣿⣿⣿⣿⢿⠿⠿⣟⣥⡾⠋⠀⠳⡽⣞⣇⠀⠙⠈⣇⣿⡇⠀⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡍⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠟⣿⠃⠀⠀⣸⡿⠟⠀⠀⠀⠉⠉⠀⠀⠀⢀⣤⣀⣤⠷⣓⣻⣯⠭⣿⠀⠀⠀⠀⠀⠀⠀⢻⣷⡀⠀⠀⠀⠀⠚⠛⠉⠉⠁⣶⣿⣧⠈⠛⠛⣻⣿⣿⣾⣿⣿⡉⠀⠀⠀⠀⢿⢻⣿⠀⠀⠀⣿⣿⡻⡆⠀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣹⡽⡃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⣿⡇⡏⠀⠀⠀⢻⣿⣦⣄⣀⡀⠀⣀⣄⣠⣴⣾⣯⠷⠞⠋⠉⠁⠀⢀⣿⠀⠀⠀⠀⠀⠀⡇⢻⣿⡃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣿⣦⣤⣤⡿⢿⣿⡟⠁⠉⠁⠀⠀⠀⠀⢸⢸⣿⠀⠀⣼⣿⣧⣷⢻⡀⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣾⡟⡾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⡋⠀⢀⣿⠻⡇⠀⠀⠀⠸⣿⡙⣿⢿⣿⣿⣿⣿⠿⠛⢹⣄⣀⣀⠀⠀⣀⣠⡾⠃⠀⠀⠀⠀⠀⣼⢃⣾⢹⡇⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠹⣿⣿⢋⣩⡴⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⣼⢸⣿⠀⢘⣿⡿⠹⡞⣇⣷⠀⠀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣹⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣟⡇⠀⣿⣿⣄⣷⡀⠀⠀⠀⠈⣿⣦⣾⣫⠀⣼⣿⡄⠀⠈⣿⠛⠛⠓⠛⠋⠉⠀⠀⠀⠀⠀⢀⣾⢋⣾⠃⣸⠇⠀⠀⠀⠀⠀⣸⠇⣤⠀⠀⠀⠙⢿⣿⣽⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣟⣾⢉⣴⡟⠋⠀⠀⢷⢻⣸⣆⡀\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢀⣴⠛⠀⣀⠀⠀⠀⠀⠀⢘⣿⡇⠀⠹⣧⠙⢿⣷⣄⢀⡀⠀⠀⢉⣴⣿⣾⣿⣿⣇⣤⣶⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⣀⣴⢟⣵⠟⠁⢀⡿⠀⠀⠀⠀⠀⣰⡟⣸⡇⠀⠀⠀⠀⠀⠙⠿⣿⣿⣷⣶⣤⣄⡀⠀⠀⣀⣾⣿⡿⠛⠁⠀⠀⠀⠀⠘⠏⣿⣿⡁\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣀⣾⡿⠃⠀⣿⠀⠀⠀⠀⠀⡌⣿⣯⡀⠀⢻⣆⠀⠙⠿⣿⠓⠳⣾⣿⣿⣿⣿⣿⣿⡿⠿⣿⠁⣴⣿⣻⣶⠷⠶⠾⠿⠿⠿⠞⠋⠁⠀⢀⣾⠃⠀⠀⠀⢀⣼⢏⣼⠿⣿⠀⠀⠀⠀⠀⠀⠀⠈⣿⠛⠻⣿⢻⣿⣿⣿⡋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣷\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡿⠁⠘⠀⣷⡆⣤⠀⠀⢠⡄⣿⡌⠻⠶⣤⣽⣷⡄⠀⠀⠀⣀⣨⡿⢿⣿⠿⠋⠁⠀⠀⠹⣷⡏⠈⠙⠛⠶⣶⣶⡀⠀⠀⠀⠀⢀⣠⡾⠃⢀⣤⣤⣾⣻⡷⠟⠁⠀⣼⡆⠀⠀⠀⠀⠀⠀⣰⠇⠀⠀⢿⣼⡟⡿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠃⣶⠀⣀⢻⣆⢹⡆⠀⠀⠃⠹⣷⠀⠀⠀⠀⠀⠀⢀⣤⣾⠿⠋⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠲⢦⣤⣈⡛⠛⣛⠉⠉⠉⠉⠉⠀⠀⠀⣰⡟⠁⠀⠀⣀⠀⠀⠀⠃⠀⠀⠀⠘⢿⡇⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡉⢸⡏⠇⣿⡄⢻⣆⠻⣦⡀⠀⢀⡙⢷⣄⣀⠀⢀⣠⡿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⡴⠶⠖⠒⠲⠶⣤⣍⣙⣿⠟⠷⢦⣤⣀⠀⢀⣠⡾⠋⠀⠀⣀⢀⣿⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⢹⣿⢸⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⣸⣷⠀⣿⣿⡀⠙⢷⣬⡻⢦⣬⣷⣀⣭⣿⡟⢋⣡⣤⣤⣤⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣈⣥⣶⣾⣿⣿⣿⣶⣦⣼⣟⣷⣤⣴⠆⠀⠉⢻⣿⣯⣤⣤⣤⡾⣣⣼⡏⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⢈⣹⣿⣷⣅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣸⣿⣷⡄⠀⠙⣿⣿⣶⣿⡉⠁⠈⢷⣿⣵⣾⡿⠿⠷⢷⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠾⠛⠋⠉⠁⠀⠀⠀⠉⠉⠙⢻⢿⣷⠶⠖⠚⠀⠀⠉⠙⠶⠾⠿⠛⢫⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⢸⠟⢸⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠹⣿⣿⠸⣷⢦⣤⣼⡿⠋⠀⠀⠀⠀⠀⠀⠉⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠇⠀⢠⠀⠀⠀⢀⠀⠃⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠀⣸⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⣿⣦⣌⣻⣦⣿⠓⠛⠋⠀⣀⠀⡀⢠⡄⠀⢠⣴⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠏⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣷⣶⠞⠛⠉⠀⠀⠀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⢷⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⣿⣙⣯⣿⣿⢻⣿⠆⠀⢀⣾⠃⠘⠃⠈⠁⠀⠈⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠶⠶⠶⣶⣾⣿⡍⠈⢹⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⢸⢻⣼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠻⣿⣿⡇⣿⣿⠉⠀⢈⣿⣹⠃⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠹⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠻⣿⣿⣿⣽⣶⡒⠋⣀⠀⠀⠀⠀⢠⣿⣿⣿⣿⡾⣾⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣾⣿⣿⡇⣽⣿⡿⢶⣿⢇⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⠶⠞⠛⠛⠉⠙⠻⢶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠏⣁⣀⣀⠨⣿⡌⠙⡇⠀⠀⢀⣿⣿⣿⣿⣿⡇⣿⣷⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⠁⠀⣸⡏⢸⠇⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⡶⠖⠲⠶⠶⠶⠶⠞⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣟⠙⢧⣝⢷⣹⣿⣿⠁⠀⠀⣾⣿⣿⣿⣿⣿⡇⢹⣹⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣿⠀⢠⣟⠃⣿⠀⠀⠀⠀⠀⠀⢀⣼⣫⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠃⢻⡄⠀⠀⠀⢸⣿⡿⠀⢀⣼⣿⣿⣿⠿⢿⣿⡇⡈⢹⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠛⠙⢻⣀⣿⠹⠀⢿⠀⠀⠀⠀⠀⠀⣾⣷⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣧⠈⣧⠀⠀⠀⣈⣿⣷⣄⣾⣿⣿⣿⣷⣤⣿⣿⡇⡇⠘⡷⡇⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣤⣀⡾⢸⡿⡇⠀⠸⣇⡀⠀⠀⠀⠀⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠀⣠⠆⢀⣴⣾⣟⣴⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⡇⡀⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣴⣿⡇⣣⡾⠟⠛⢛⠻⢿⣷⣀⠀⠀⠀⢹⡆⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⠤⠄⠀⠀⠀⠀⠀⠤⠶⢤⣤⣀⣀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣘⣡⡴⠟⠁⣠⣿⡟⣡⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡇⢿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⠿⠋⠀⠀⠀⠀⠀⢀⡴⠿⢧⡀⠀⠀⢻⣄⣀⣠⡤⠶⠞⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢘⣋⣿⠁⠀⣀⣼⢟⣭⣿⣿⣿⡛⠉⢹⣿⣿⣿⣿⣤⣿⣿⣿⣿⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⢀⣀⣉⣀⣠⡈⢻⡄⠀⠀⠘⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⣼⢿⡟⠛⢛⣩⣾⣿⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠸⢻⡄⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" +
                "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⢀⣤⡶⠟⠋⠁⠀⠀⠈⠉⢻⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣨⣿⣿⢿⣧⣾⣿⣿⣿⣿⣇⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⢿⣸⠀⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⢹\n" +
                "⣿⣿⣿⡟⠿⠋⠈⠉⠛⠋⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⣀⣠⠾⠋⠁⠀⠀⠀⠀⠀⠀⠀⢀⡈⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⢸⣾⠀⣏⣇⠀⠀⠀⠀⠀⠀⠀⠀⢸\n" +
                "⡟⠛⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⢿⣿⣿⣿⣿⡆⠘⠛⠁⡀⠀⠀⠀⠀⠀⠐⠀⢀⣠⡴⠟⠻⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⢾⣿⣿⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢸⣿⠀⢻⣿⠀⠀⠀⠀⠀⠀⠀⠀⢸\n" +
                "⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠻⢿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⠟⠉⠀⠀⠀⢼⡇⢹⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡴⠞⠋⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠀⢸⣿⠀⢸⣾⡆⠀⠀⠀⠀⠀⠀⠀⢸\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢙⣿⡇⠀⠀⠀⠀⠀⠀⠀⣠⡾⠋⠀⠀⠠⠞⠀⠰⣿⡇⠀⣿⣿⡿⢦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⡴⠟⠋⠁⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠀⠀⣸⣧⠀⠀⣿⣷⡆⠀⠀⠀⠀⠀⠀⢸\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣺⡿⣆⠀⠀⠀⠄⠀⣰⠟⠁⠀⠠⠀⠀⠀⠈⢁⣼⠏⢿⡄⣿⣿⡇⠀⠉⠛⠶⠦⣤⣤⣤⣤⣤⣶⣶⢾⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⢛⣿⣿⣿⣿⣿⣿⠀⠀⠀⢸⡏⡟⡇⠀⣧⣿⡃⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠋⠀⢻⡄⠀⣠⣄⢿⡃⠀⠀⠀⠀⠀⠀⠀⢰⡿⢃⠀⠈⣧⣿⣿⡇⠀⠀⠀⠀⠀⠀⢸⡟⠛⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡿⠛⠉⣀⣤⣾⡿⠿⠉⠈⠙⣛⣿⡛⠶⣤⡀⠀⣷⡇⠀⢸⣿⣾⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣇⣦⣀⢠⣿⣦⣈⠉⠠⡀⡀⠀⠀⠀⠀⠀⣠⠟⠀⠀⠀⢁⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⢸⢀⣠⠄⠀⠀⠀⢴⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⠿⡛⠁⠀⣠⣴⣾⠟⢉⣁⠦⠠⣾⣀⡀⠸⣇⠁⠹⠌⢷⡆⣿⣇⠀⠘⣿⣿⡄⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠋⠉⠉⠻⣿⣦⡉⢻⣆⠄⠀⠆⠀⠀⠀⠀⢰⠿⠄⠀⡀⣂⣸⡏⠙⠻⣿⣷⣤⣄⣀⣤⣄⣼⢿⣿⣶⣿⣿⣿⣿⠹⣷⣶⢶⣶⣶⣦⣤⢤⣤⣾⡟⢙⣿⡿⠛⣥⡀⢹⣶⣿⠟⠋⠐⠦⠀⠉⠀⠒⠀⠁⠉⠀⣊⢷⣶⠄⠀⢿⢹⣿⠀⠀⢿⣿⣧⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⠃⠀⠀⠀⠀⠀⠈⢛⣽⣾⣧⠀⠀⠀⠐⠆⠀⠀⠀⠀⠀⠀⡜⣱⡏⣧⠀⠀⠀⠈⠙⢿⡿⠻⢿⡿⠈⠻⣿⣿⣿⠿⠋⢸⣿⣿⣿⣿⣿⣿⣿⣿⠟⣩⣾⡿⠋⠀⠀⢀⣿⣿⠟⢁⣀⠀⠀⣠⡀⠘⠀⠀⠲⠀⠀⣀⣬⡶⠟⠻⠟⠻⠾⣿⣇⠀⢸⣿⣽⡄⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⢧⠐⠂⠀⠋⠀⠀⠀⣼⠃⠘⣏⠳⣄⠀⠀⠀⠀⠀⠀⠙⠇⠠⢰⣿⠀⠸⡆⠀⠀⠀⠠⠟⣀⣤⣿⢿⣄⢀⡀⠀⠀⣀⣠⡾⠿⣿⣿⣿⣿⡿⢋⣠⡾⠛⠁⠀⠀⢀⣴⣿⠟⠁⠀⠨⠋⠀⠘⠀⠀⠂⠘⢀⣠⣶⠿⠻⢌⠁⠀⠀⠀⠀⠀⠈⠻⣷⡀⠏⣿⣇⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣄⠀⠀⢠⠀⠀⢠⡏⠉⠀⣹⠆⡌⠛⢦⡀⣀⠀⠀⠀⠀⠀⣿⢸⡇⠀⢹⡄⠀⣠⡶⠿⠛⢉⡟⠀⠙⢻⠿⠵⠶⠟⠋⠀⠀⣠⣼⣿⣯⣶⠛⠁⠀⠀⠀⢀⣴⣿⠟⠁⠀⠀⠀⠀⠈⠀⠀⠀⠀⣠⣶⡿⢛⠁⡄⢃⡈⠀⠀⠀⠦⡀⠀⠀⠀⠘⣷⣀⢻⣿⡀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣻⠟⢛⢲⣦⣌⠙⢣⡞⣤⡀⠀⠀⠂⠀⠀⠀⠀⠀⠀⠀⠴⡁⣰⣿⡌⣧⢤⠀⢳⣾⠏⠀⠀⢀⡾⠁⠀⠀⠀⣀⣠⣀⣀⣀⡴⢞⣩⠞⠛⠉⠀⣀⠀⠀⢀⣴⣿⣿⠟⠀⠁⠀⠀⠀⠀⠀⠀⠀⣠⣾⠟⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣇⣿⣯⣇⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡿⡆⠀⠈⠙⠿⣿⡟⠀⠘⠻⠀⠀⠀⠀⠀⠀⠄⠀⢀⢀⠾⣱⡟⠀⢧⠸⣾⢷⣸⡏⠀⠀⢀⣀⠀⢀⣀⣠⠿⢟⣛⣫⢿⣫⣴⠟⠋⠀⠐⠀⠀⠀⢀⣴⣿⠇⢀⡟⠄⠀⢤⠀⠀⠀⠀⠀⢀⣾⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠦⠀⠀⣿⢿⣽⣿⡄⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠁⠀⠀⠀⠀⣴⠏⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⣰⠟⣿⡀⠚⠁⠹⣦⡿⠁⠀⠀⠸⣿⠞⠛⠉⣠⣴⣿⣿⣿⠟⠋⠀⠀⠀⠀⢀⣀⣤⣶⣿⠛⠁⠀⢸⡇⠠⠄⠈⠃⠀⠀⢀⣴⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡿⠀⢿⣿⣧⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠃⠀⠀⠀⢠⡾⠋⠄⢀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠔⠀⠀⢰⡿⠞⢹⣷⡀⢢⡀⣿⡇⠀⠀⠀⠀⠀⣠⣴⣿⣿⡿⠟⠉⠀⢀⣠⣤⣴⢶⣾⣿⡿⠋⠉⠤⠀⠀⠀⢸⣇⢂⡰⠄⠀⠀⢀⣾⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⣀⣠⡤⠴⠶⠶⣶⢶⣶⢾⠟⠁⠀⠘⣿⣿⡆⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⠃⠀⠀⠀⣠⡟⠛⠈⠠⠌⢦⡀⠀⠀⠀⠀⠀⠀⠐⣆⠀⢠⡿⠁⠀⠀⠻⣿⡄⠃⣿⠀⠀⠀⣠⣴⣿⠟⣟⣻⣥⣤⡶⣶⣿⣋⣉⣯⣥⣴⣶⡾⣶⡶⣶⣶⣶⣶⣶⣾⡃⠀⠀⠒⠄⠀⣼⡟⠀⠠⢦⠂⠀⠠⠀⠀⣠⡤⢖⣻⠽⠗⠀⠀⠀⠀⡟⣼⠋⠀⠀⠀⠀⠀⠹⣿⡿⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⣀⡾⠃⠀⠀⢀⣴⠏⠀⡄⠀⠀⠀⠂⠁⠀⠠⠀⠀⠀⠀⠀⠀⢀⡿⠥⠀⠀⠀⠠⠀⢻⡜⣿⣤⣶⣿⣿⣿⣶⣾⠟⠿⣛⣭⣶⣿⣿⣿⣿⣿⣻⣿⣿⣿⣿⣧⣿⣿⣿⣿⣿⣿⣇⠀⠀⢠⠜⣺⡿⠀⠀⠀⠀⠀⠀⣀⣴⣻⡵⠚⠉⠀⠀⠀⠀⠀⠀⢰⢧⡟⠀⠀⠀⠀⠀⠀⠀⢻⣿⡄⠀\n" +
                "⠀⠀⠀⠀⠀⠀⢀⡿⠃⠀⠀⣠⡾⠃⠀⠈⠁⠘⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⢀⣾⣷⡄⠀⢀⣤⠶⣞⣛⣛⣿⣿⣿⡛⣋⠁⣀⣭⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⡿⢻⣿⣿⣿⡏⠀⠄⠀⢰⣟⠱⠀⠠⣀⠀⣠⣾⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠈⢿⡀\n" +
                "⠀⠀⠀⠀⠀⢠⣿⠁⠀⢀⣴⠟⠀⠀⠀⠀⠀⠀⠒⠀⠀⠀⠀⠀⠂⠀⠀⠀⢀⣾⣷⣾⣿⡾⠋⣱⡿⠿⣿⣿⡏⠨⠻⣟⣷⣿⣿⣿⣿⡿⣿⣿⣿⣾⣭⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣼⣿⣿⣿⢿⡀⠘⠠⣼⡟⠀⢂⡰⣩⣾⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠋⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳\n" +
                "⠀⠀⠀⠀⢰⡿⠁⢀⣴⠟⠉⠀⠛⡦⠀⠀⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⢏⣠⢠⣿⣢⣤⣀⣸⡇⣄⡀⢹⡿⣿⣿⢿⣿⣧⣿⣿⣿⣿⣭⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠸⣿⠃⠀⣿⣅⢸⢟⣴⣻⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣶⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢠⡿⠁⣠⠞⠋⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⡏⢸⣿⣯⡙⢿⣿⣽⣿⣦⣿⠁⢸⣯⣿⣿⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣿⡛⣿⣽⣿⣿⣿⣿⣿⡟⠁⠀⠹⣧⠠⣏⠘⣻⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⡟⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠟⠴⠟⠁⠀⣀⠁⠀⠀⠀⡀⠀⠀⢀⡁⠀⠀⢀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⡧⢾⣿⠿⢽⣿⣿⣭⣿⢋⣿⠀⣼⢿⣿⢻⣿⣿⣿⣿⣿⡏⣻⣿⣿⣿⢿⣿⣿⣿⣿⣿⣇⣿⣿⣿⡿⢦⣀⡀⠀⠹⣧⢿⣼⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }

    public static void readyCheck(){
        String readyCheck;
        System.out.println();
        System.out.println("***********************************************************************");
        System.out.println("\tHello! Welcome to hangman! Ready to play? (Enter \"Yes\" or \"No\")");
        System.out.println("***********************************************************************");

        readyCheck = scnr.nextLine();

        while(!(readyCheck.equalsIgnoreCase("yes"))) {
            System.out.println("Ok. Type \"yes\" when ready.");
            readyCheck = scnr.nextLine();
        }
    }


    public static void splitWordIntoArray() {
        for (int i = 0; i < wordToGuess.length(); i++) {
            lettersToGuess.add(Character.toString(wordToGuess.charAt(i)));
        }
    }

    public static void makeUnderscores() {
        for (int i = 0; i < lettersToGuess.size(); i++) {
            underscores.add("_");
        }
    }

    public static void replaceUnderscores(String guess) {
        for (int i = 0; i < lettersToGuess.size(); i++) {
            if (lettersToGuess.get(i).equals(guess.toLowerCase())) {
                underscores.set(i, guess.toLowerCase());
            }
        }
    }

    public static boolean isCorrectGuess(String guess) {
        boolean correct = false;
        for (int i = 0; i < lettersToGuess.size(); i++) {
            if (guess.equalsIgnoreCase(lettersToGuess.get(i))) {
                correct = true;
            }
        }
        return correct;
    }

    public static boolean isAlreadyGuessed(String guess) {
        boolean guessed = false;
        for (int i = 0; i < guessedLetters.size(); i++) {
            if (guess.equalsIgnoreCase(guessedLetters.get(i))) {
                guessed = true;
            }
        }
        return guessed;
    }

    public static boolean checkGameWin() {
        int matchNum = 0;
        boolean won = false;
        for (int i = 0; i < lettersToGuess.size(); i++) {
            for (int j = 0; j < guessedLetters.size(); j++) {
                if (lettersToGuess.get(i).equalsIgnoreCase(guessedLetters.get(j))) {
                    matchNum += 1;
                    if (matchNum == lettersToGuess.size()) {
                        won = true;
                        break;
                    }
                }
            }
        }
        return won;
    }

    public static boolean checkGameLoss() {
        boolean loss = chances == 0;
        return loss;
    }

    public static void play() {
        theHangedMan(chances);
        System.out.println("Input your first guess: ");
        System.out.println(underscores);
        userGuess = scnr.next();
        if (userGuess.length() > 1) {
            System.out.println("You can only put in one letter at a time. Try again.");
            play();
        }
        char charUserGuess = userGuess.charAt(0);
        if (Character.isDigit(charUserGuess)) {
            System.out.println("Only input letters.");
            play();
        }
        if (isAlreadyGuessed(userGuess)) {
            System.out.println("You have already guessed that.");
            play();
        }
        if (isCorrectGuess(userGuess)) {
            System.out.println("Correct!");
            guessedLetters.add(userGuess);
            replaceUnderscores(userGuess);
            if (checkGameWin()) {
                winAscii();
                System.out.println("Congratulations!");
                System.exit(0);
            }
            else {
                play();
            }
        }
        else {
            chances -= 1;
            theHangedMan(chances);
            System.out.println("Incorrect guess! You have " + chances + " guess(es) left.");
            guessedLetters.add(userGuess);
            if (checkGameLoss()) {
                looseAscii();
                System.out.println("You lost! The correct word is: " + wordToGuess);
                System.exit(0);
            }
            else {
                play();
            }
        }
    }

    public static void run() {
        readyCheck();
        splitWordIntoArray();
        makeUnderscores();
        play();
    }

    public static void main(String[] args) {
        run();
    }
}