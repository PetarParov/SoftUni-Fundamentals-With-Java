package MethodsExercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(vowelsCount(input));

    }

    public static int vowelsCount (String word){
        int countVowels = 0;
        char[] arr = new char[word.length()];
        // Copy character by character into array
        for (int i = 0; i < word.length(); i++) {
            arr[i] = word.charAt(i);
            if (word.charAt(i) == 65 || word.charAt(i) == 69 || word.charAt(i) == 73 ||
                    word.charAt(i) == 79 || word.charAt(i) == 85 ||
                    word.charAt(i) == 97 || word.charAt(i) == 101 || word.charAt(i) == 105 ||
                    word.charAt(i) == 111 || word.charAt(i) == 117){
                countVowels++;
            }
        }

        return countVowels;

    }
}
