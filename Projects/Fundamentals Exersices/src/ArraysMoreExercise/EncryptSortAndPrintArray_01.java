package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumVowels = 0;
        int sumConsonant = 0;
        int sum = 0;
        String vowels = "EeUuIiOoAa";

        int[] arrayOfSums = new int[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            for (int j = 0; j < name.length(); j++) {
                char currentLetter = name.charAt(j);

                if (vowels.contains(String.valueOf(currentLetter))) {
                    sumVowels += currentLetter * name.length();
                } else {
                    sumConsonant += currentLetter / name.length();
                }
            }

            sum = sumVowels + sumConsonant;
            arrayOfSums[i] = sum;
            sumVowels = 0;
            sumConsonant = 0;
            sum = 0;
        }

        Arrays.sort(arrayOfSums);
        for (int arrayOfSum : arrayOfSums) {
            System.out.println(arrayOfSum);
        }
    }
}