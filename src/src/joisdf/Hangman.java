import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Create an array of words to choose from
        String[] words = { "programming", "java", "computer", "hangman", "phone" };

        // Pick a random word from the array
        String word = words[(int)(Math.random() * words.length)];

        // Create an array of dashes, the same length as the word
        String[] dashes = new String[word.length()];
        for (int i = 0; i < dashes.length; i++) {
            dashes[i] = "-";
        }

        // Initialize the number of guesses the user has left
        int guessesLeft = 6;

        // Keep looping until the user has won or lost
        while (guessesLeft > 0 && !isWordComplete(dashes)) {
            // Print the current state of the word (e.g. "--a-a--")
            System.out.println(String.join("", dashes));

            // Print the number of guesses the user has left
            System.out.println("Guesses left: " + guessesLeft);

            // Ask the user for a guess
            System.out.print("Enter a letter: ");
            char guess = in.nextLine().charAt(0);

            // Check if the guess is in the word
            boolean isInWord = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    dashes[i] = Character.toString(guess);
                    isInWord = true;
                }
            }

            // If the guess is not in the word, decrement the number of guesses
            if (!isInWord) {
                guessesLeft--;
            }
        }

        // Print the final state of the word
        System.out.println(String.join("", dashes));

        // Print a message depending on whether the user won or lost
        if (isWordComplete(dashes)) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Sorry, you lost. The word was: " + word);
        }
    }

    // Returns true if all dashes in the array have been replaced with letters
    public static boolean isWordComplete(String[] dashes) {
        for (String dash : dashes) {
            if (dash.equals("-")) {
                return false;
            }
        }
        return true;
    }
}
