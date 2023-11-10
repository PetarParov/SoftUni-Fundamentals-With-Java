package TextProcessing_MoreExercise;

import java.util.Scanner;

public class TreasureFinder_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the key as an array of integers
        String[] keyInput = scanner.nextLine().split("\\s+");

        int[] key = new int[keyInput.length];

        for (int i = 0; i < keyInput.length; i++) {
            key[i] = Integer.parseInt(keyInput[i]);
        }

        // Read the encrypted messages until "find"
        String message = scanner.nextLine();

        while (!message.equals("find")) {
            // Decrypt the message by subtracting the key values from the ASCII codes of the characters
            StringBuilder decrypted = new StringBuilder();

            int keyIndex = 0;
            for (char c : message.toCharArray()) {
                decrypted.append((char) (c - key[keyIndex]));
                keyIndex++;
                if (keyIndex == key.length) {
                    keyIndex = 0;
                }
            }
            // Extract the treasure type and the coordinates from the decrypted message
            String treasure = decrypted.substring(decrypted.indexOf("&") + 1, decrypted.lastIndexOf("&"));
            String coordinates = decrypted.substring(decrypted.indexOf("<") + 1, decrypted.indexOf(">"));
            // Print the result
            System.out.println("Found " + treasure + " at " + coordinates);
            // Read the next message
            message = scanner.nextLine();
        }
    }
}