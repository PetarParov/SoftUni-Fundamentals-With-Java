package Methods_L04;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensAndOdds(number));
    }
    public static int getMultipleOfEvensAndOdds(int number) {
        number = Math.abs(number);
        int sumOfEvens = getSumOfEvenDigits(number);
        int sumOfOdds = getSumOfOddDigits(number);
        return sumOfEvens * sumOfOdds;
    }
    public static int getSumOfEvenDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int getSumOfOddDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}