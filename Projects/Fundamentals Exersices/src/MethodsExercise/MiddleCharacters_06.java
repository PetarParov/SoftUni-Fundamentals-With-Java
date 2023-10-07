package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleChar(text);


    }

    public static void printMiddleChar(String text) {
        int lenght = text.length();

        if (lenght % 2 != 0) {
            int index = lenght / 2;
            System.out.println(text.charAt(index));
        } else {
            int indexSecondMiddleChar = lenght / 2;
            int indexFirstMiddleChar = indexSecondMiddleChar - 1;

            System.out.print(text.charAt(indexFirstMiddleChar));
            System.out.print(text.charAt(indexSecondMiddleChar));
        }
    }
}
