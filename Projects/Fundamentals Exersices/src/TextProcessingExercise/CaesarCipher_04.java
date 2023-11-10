package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        for (char letter : input) {

            char newLetter = (char) (letter+3);
            System.out.print(newLetter);

        }
    }
}
