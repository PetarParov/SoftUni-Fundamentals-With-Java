package Methods_L04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();

        char op = sc.next().charAt(0);

        double num2 = sc.nextDouble();

        sc.close();

        double result = calculate(num1, op, num2);

        System.out.println(new DecimalFormat("0.####").format(result));
    }

    public static double calculate(double num1, char op, double num2) {
        double result = 0.0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero");
                    System.exit(1);
                }
                break;
        }
        return result;
    }

}
