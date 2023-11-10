package TextProcessing_MoreExercise;

import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the first character
        char first = scanner.nextLine().charAt(0);
        // Read the second character
        char second = scanner.nextLine().charAt(0);
        // Read the random string
        String random = scanner.nextLine();
        // Initialize the sum to zero
        int sum = 0;
        // Loop through the random string
        for (int i = 0; i < random.length(); i++) {
            // Get the current character
            char current = random.charAt(i);
            // Check if the current character is between the first and second characters
            if ((current > first && current < second) || (current > second && current < first)) {
                // Add the ASCII code of the current character to the sum
                sum += (int) current;
            }
        }
        // Print the sum
        System.out.println(sum);
    }
}