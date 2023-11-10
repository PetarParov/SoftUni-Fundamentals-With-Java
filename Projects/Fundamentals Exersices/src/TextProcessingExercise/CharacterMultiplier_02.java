package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {

    // This method takes two strings as arguments and returns the sum of their character codes multiplied
    public static int sumOfCharacterCodesMultiplied(String str1, String str2) {
        // Initialize the total sum to zero
        int sum = 0;
        // Get the lengths of the strings
        int len1 = str1.length();
        int len2 = str2.length();
        // Loop through the shorter string
        for (int i = 0; i < Math.min(len1, len2); i++) {
            // Get the character codes of the current characters
            int code1 = (int) str1.charAt(i);
            int code2 = (int) str2.charAt(i);
            // Multiply them and add to the sum
            sum += code1 * code2;
        }
        // If the first string is longer, add the remaining character codes to the sum
        if (len1 > len2) {
            for (int i = len2; i < len1; i++) {
                int code1 = (int) str1.charAt(i);
                sum += code1;
            }
        }
        // If the second string is longer, add the remaining character codes to the sum
        if (len2 > len1) {
            for (int i = len1; i < len2; i++) {
                int code2 = (int) str2.charAt(i);
                sum += code2;
            }
        }
        // Return the final sum
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");

        String firstString = input[0];
        String secondString = input[1];
        System.out.println(sumOfCharacterCodesMultiplied (firstString, secondString));

    }
}