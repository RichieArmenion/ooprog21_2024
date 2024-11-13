import java.util.Scanner;

public class SpoonerismGenerator {

    private Scanner scanner = new Scanner(System.in);

    // Method to prompt the user to enter a word
    private String getWord(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    // Method to find the index of the first vowel in a word
    private int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            if ("AEIOUaeiou".indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; // Returns -1 if no vowel is found
    }

    // Method to run the Spoonerism logic
    public void run() {
        String word1 = getWord("Enter the first word: ");
        String word2 = getWord("Enter the second word: ");

        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

        // Check if both words contain a vowel
        if (index1 == -1 || index2 == -1) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
            return;
        }

        // Create spoonerized words by swapping initial consonant sounds
        String spoonerizedWord1 = word2.substring(0, index2) + word1.substring(index1);
        String spoonerizedWord2 = word1.substring(0, index1) + word2.substring(index2);

        System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
    }

    public static void main(String[] args) {
        SpoonerismGenerator generator = new SpoonerismGenerator();
        generator.run();
    }
}
