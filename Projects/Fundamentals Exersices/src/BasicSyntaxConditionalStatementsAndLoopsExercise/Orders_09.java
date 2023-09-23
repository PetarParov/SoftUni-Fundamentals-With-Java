package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        for (int i = 1; i <= countOrders ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int countDays = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());
            double pricePerOrder = (countDays * countCapsules) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", pricePerOrder);
            totalSum += pricePerOrder;
        }
        System.out.printf("Total: $%.2f%n", totalSum);
    }
}
