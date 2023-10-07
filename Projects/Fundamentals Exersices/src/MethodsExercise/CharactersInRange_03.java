package MethodsExercise;

import java.util.Scanner;


public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        symbolsInBetween(firstSymbol, secondSymbol);
    }

    public static void symbolsInBetween(char first, char second) {
        if (first < second) {
            for (int i = first + 1; i < second; i++) {
                char result = (char) i;
                System.out.print(result + " ");
            }
        } else if (first > second) {
            for (int i = second + 1; i < first; i++) {
                char result2 = (char) i;
                System.out.print(result2 + " ");
            }
        }
    }
}
