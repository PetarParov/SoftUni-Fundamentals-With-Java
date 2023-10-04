package Methods_L04;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        totalPrice(product, quantity);
    }

    public static void totalPrice(String product, int quantity){
        double price = 0;
        switch (product){
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1;
            break;
            case "coke":
                price = 1.4;
                break;
            case "snacks":
                price = 2;
                break;
        }
        double totalPrice = quantity * price;
        System.out.printf("%.2f", totalPrice);
    }
}
