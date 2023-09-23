package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChars = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= countChars ; i++) {
            char symbol = scanner.next().charAt(0);
            sum += symbol;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
