package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long firstFact = factorial(firstNumber);
        long secondFact = factorial(secondNumber);

        double result = (double) firstFact / secondFact;
        System.out.printf("%.2f", result);
    }

    public static long factorial (int number){
        long fact = 1;
        for (long i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
