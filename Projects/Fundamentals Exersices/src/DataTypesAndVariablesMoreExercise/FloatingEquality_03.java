package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;
        boolean isEqual = Math.abs(num1 - num2) < eps;

        if (isEqual){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
