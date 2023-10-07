package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            } else {
                int number = Integer.parseInt(input);
                System.out.println(isPalindrome(number));
            }
        }
    }
    public static boolean isPalindrome(int number) {

        int original = number;

        int reversed = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }
        return original == reversed;
    }
}