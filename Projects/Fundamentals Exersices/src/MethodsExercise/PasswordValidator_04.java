package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isValid = true;

        if (!isLengthValid(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        if (!isContentValid(password)) {
            System.out.println("Password must consist only of letters and digits");
            isValid = false;
        }

        if (!isDigitCountValid(password)) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isLengthValid(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean isContentValid(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDigitCountValid(String password) {
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
}