package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int sum = sum (num1, num2);

        System.out.println(subtract(sum, num3));
    }

    public static int sum (int a, int b) {
        return a + b;
    }
    public static int subtract (int a, int b){
        return a - b;
    }
}
