package MethodsMoreExercise;

import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int product = num1 * num2 * num3;

        if (product > 0){
            System.out.println("positive");
        } else if (product < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
