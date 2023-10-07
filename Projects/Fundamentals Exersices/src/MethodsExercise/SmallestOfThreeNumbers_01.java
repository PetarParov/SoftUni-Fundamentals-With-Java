package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestNumber(num1, num2, num3));

    }

    public static int smallestNumber(int a, int b, int c) {
        int minNumber = Integer.MAX_VALUE;
        if (a < minNumber) {
            minNumber = a;
        } if (b < minNumber) {
            minNumber = b;
        } if (c < minNumber) {
            minNumber = c;
        }
        return minNumber;
    }
}
