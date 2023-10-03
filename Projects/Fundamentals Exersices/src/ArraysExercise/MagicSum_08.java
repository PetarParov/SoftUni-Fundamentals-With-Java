package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= array.length - 1; i++) {
            int currentNumber = array [i];
            for (int j = i + 1; j <= array.length - 1; j++) {
                int nextNumber = array[j];
                if (currentNumber + nextNumber == magicSum){
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}
