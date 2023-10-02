package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int [] firstArray = new int[rows];
        int [] secondArray = new int[rows];

        for (int i = 1; i <= rows ; i++) {
            String input = scanner.nextLine();
            String [] numbers = input.split(" ");
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);
            if (i % 2 != 0){
                firstArray[i-1] = num1;
                secondArray[i-1] = num2;
            }else {
                firstArray[i-1] = num2;
                secondArray[i-1] = num1;
            }
        }
        for (int el1 : firstArray){
            System.out.print(el1 + " ");
        }
        System.out.println();
        for (int el2: secondArray) {
            System.out.print(el2 + " ");
        }

    }
}
