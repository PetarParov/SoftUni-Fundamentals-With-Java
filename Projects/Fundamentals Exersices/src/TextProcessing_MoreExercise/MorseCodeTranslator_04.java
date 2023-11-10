package TextProcessing_MoreExercise;

import java.util.HashMap;
import java.util.Scanner;

public class MorseCodeTranslator_04 {
    // A map to store the Morse code for each letter
    private static final HashMap<String, Character> morseMap = new HashMap<>();

    // A method to initialize the map
    private static void initMap() {
        morseMap.put(".-", 'A');
        morseMap.put("-...", 'B');
        morseMap.put("-.-.", 'C');
        morseMap.put("-..", 'D');
        morseMap.put(".", 'E');
        morseMap.put("..-.", 'F');
        morseMap.put("--.", 'G');
        morseMap.put("....", 'H');
        morseMap.put("..", 'I');
        morseMap.put(".---", 'J');
        morseMap.put("-.-", 'K');
        morseMap.put(".-..", 'L');
        morseMap.put("--", 'M');
        morseMap.put("-.", 'N');
        morseMap.put("---", 'O');
        morseMap.put(".--.", 'P');
        morseMap.put("--.-", 'Q');
        morseMap.put(".-.", 'R');
        morseMap.put("...", 'S');
        morseMap.put("-", 'T');
        morseMap.put("..-", 'U');
        morseMap.put("...-", 'V');
        morseMap.put(".--", 'W');
        morseMap.put("-..-", 'X');
        morseMap.put("-.--", 'Y');
        morseMap.put("--..", 'Z');
    }

    // A method to translate a Morse code message to English
    private static String translate(String message) {
        // Initialize the map
        initMap();

        // Split the message by spaces
        String[] words = message.split(" ");

        // A StringBuilder to store the translated message
        StringBuilder sb = new StringBuilder();

        // Loop through each word
        for (String word : words) {
            // If the word is "|", append a space to the StringBuilder
            if (word.equals("|")) {
                sb.append(" ");
            } else {
                // Otherwise, look up the Morse code in the map and append the corresponding letter
                char letter = morseMap.getOrDefault(word, '?');
                sb.append(letter);
            }
        }

        // Return the translated message
        return sb.toString();
    }

    // A main method to test the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Read the message
        String message = sc.nextLine();

        // Translate the message
        String translation = translate(message);

        // Print the translation
        System.out.println(translation);
    }
}