package RegularExpressions_MoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelper_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the key from the input
        int key = Integer.parseInt(scanner.nextLine());
        // Create a pattern to match the valid messages
        Pattern pattern = Pattern.compile("@([A-Za-z]+)[^@\\-!:>]*!([GN])!");
        // Create a string builder to store the names of the good children
        StringBuilder goodChildren = new StringBuilder();
        // Read the messages until "end" is given
        String message = scanner.nextLine();
        while (!message.equals("end")) {
            // Decrypt the message by subtracting the key from each character
            StringBuilder decrypted = new StringBuilder();
            for (char c : message.toCharArray()) {
                decrypted.append((char) (c - key));
            }
            // Check if the decrypted message matches the pattern
            Matcher matcher = pattern.matcher(decrypted.toString());
            if (matcher.find()) {
                // Extract the name and the behavior from the message
                String name = matcher.group(1);
                String behavior = matcher.group(2);
                // If the behavior is "G", append the name to the good children list
                if (behavior.equals("G")) {
                    goodChildren.append(name).append("\n");
                }
            }
            // Read the next message
            message = scanner.nextLine();
        }
        // Print the names of the good children
        System.out.print(goodChildren.toString());
    }
}