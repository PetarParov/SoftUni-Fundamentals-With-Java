package MethodsMoreExercise;

import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first line of input as a string
        String dataType = scanner.nextLine();

        // Check the data type and perform the corresponding operation
        switch (dataType) {
            case "int":
                int num = scanner.nextInt();
                System.out.println(num * 2);
                break;

            case "real":
                double realNum = scanner.nextDouble();
                // Multiply the number by 1.5 and format it to two decimal places
                System.out.printf("%.2f%n", realNum * 1.5);
                break;
            case "string":
                // Read the next line as a string
                String str = scanner.nextLine();
                // Surround the string with "$" and print the result
                System.out.println("$" + str + "$");
                break;

        }

    }
}