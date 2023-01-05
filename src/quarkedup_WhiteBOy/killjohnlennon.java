//import java.util.Scanner;
//
//public class killjohnlennon {
//
//    public static void main(String[] args) {
//        // Set up the game
//        String[] words = {"apple", "banana", "orange"};
//        String word = words[(int) (Math.random() * words.length)];
//        int maxWrongGuesses = 5;
//        int wrongGuesses = 0;
//        StringBuilder currentGuess = new StringBuilder(word.replaceAll(".", "_ "));
//        Scanner in = new Scanner(System.in);
//
//        // Play the game
//        while (wrongGuesses < maxWrongGuesses) {
//            System.out.println("Current guess: " + currentGuess);
//            System.out.println("Guesses remaining: " + (maxWrongGuesses - wrongGuesses));
//            System.out.println("Enter a letter: ");
//            char c = in.nextLine().charAt(0);
//            if (word.indexOf(c) >= 0) {
//                // Update currentGuess to reflect the new correct guess
//                for (int i = 0; i < word.length(); i++) {
//                    if (word.charAt(i) == c) {
//                        currentGuess.setCharAt(i * 2, c);
//                    }
//                }
//                // Check if the game is over
//                if (currentGuess.indexOf("_") < 0) {
//                    System.out.println("Congratulations! You won!");
//                    System.out.println("The word was: " + word);
//                    return;
//                }
//            } else {
//                wrongGuesses++;
//            }
//        }
//
//        // Game over
//        System.out.println("You lost!");
//        System.out.println("The word was: " + word);
//    }
//
//}
