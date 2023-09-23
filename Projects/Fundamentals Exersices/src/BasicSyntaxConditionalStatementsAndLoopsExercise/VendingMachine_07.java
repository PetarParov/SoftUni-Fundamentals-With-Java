package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // масив от валидни монети
        final double[] VALID_COINS = {0.1, 0.2, 0.5, 1, 2};

        // масив от продукти
        final String[] PRODUCTS = {"Nuts", "Water", "Crisps", "Soda", "Coke"};

        // масив от цени
        final double[] PRICES = {2.0, 0.7, 1.5, 0.8, 1.0};

        // променлива за парите, които се вкарват
        double sum = 0;

        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            // Щом инпута не е Старт, значи е монета. Парсваме я за стойността й
            double coin = Double.parseDouble(input);

            // Проверка дали е валидна
            boolean isValid = false;
            for (double validCoin : VALID_COINS) {
                if (coin == validCoin) {
                    isValid = true;
                    break;
                }
            }
            // ако монетата е валидна, я добавяме към сумата
            if (isValid) {
                sum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }

            input = scanner.nextLine();
        }

        //Избиране на продукт
        input = scanner.nextLine();
        while (!input.equals("End")) {
            boolean isValid = false;
            int index = -1;
            for (int i = 0; i < PRODUCTS.length; i++) {
                if (input.equals(PRODUCTS[i])) {
                    isValid = true;
                    index = i;
                    break;
                }
            }
            if (isValid) {
                if (sum >= PRICES[index]) {
                    sum -= PRICES[index];
                    System.out.printf("Purchased %s%n", input);
                } else {
                    System.out.println("Sorry, not enough sum");
                }
            } else {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f%n", sum);
    }
}
