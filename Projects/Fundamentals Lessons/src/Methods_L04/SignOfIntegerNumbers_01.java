package Methods_L04;

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        integerNumbers();
    }
    public static void integerNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number == 0) {
            System.out.println("The number 0 is zero.");
        } else {
            System.out.printf("The number %d is negative.", number);
        }
    }
}
