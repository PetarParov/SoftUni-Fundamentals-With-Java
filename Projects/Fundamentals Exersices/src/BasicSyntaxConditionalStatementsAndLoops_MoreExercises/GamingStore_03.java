package BasicSyntaxConditionalStatementsAndLoops_MoreExercises;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        double totalSpent = 0;

        String input = scanner.nextLine();

        while (!input.equals("Game Time")) {

            switch (input) {
                case "OutFall 4":
                    currentBalance -= 39.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 39.99;
                    } else {
                        totalSpent += 39.99;
                        System.out.println("Bought OutFall 4");
                    }
                    break;
                case "CS: OG":
                    currentBalance -= 15.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 15.99;
                    } else {
                        totalSpent += 15.99;
                        System.out.println("Bought CS: OG");
                    }
                    break;
                case "Zplinter Zell":
                    currentBalance -= 19.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 19.99;
                    } else {
                        totalSpent += 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }
                    break;
                case "Honored 2":
                    currentBalance -= 59.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 59.99;
                    } else {
                        totalSpent += 59.99;
                        System.out.println("Bought Honored 2");
                    }
                    break;
                case "RoverWatch":
                    currentBalance -= 29.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 29.99;
                    } else {
                        totalSpent += 29.99;
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    currentBalance -= 39.99;
                    if (currentBalance < 0) {
                        System.out.println("Too Expensive");
                        currentBalance += 39.99;
                    } else {
                        totalSpent += 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }
                    break;
                default:
                    System.out.println("Not Found");

            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                break;
            }

            input = scanner.nextLine();
        }
        if (currentBalance > 0) {
            System.out.printf("Total spent: $%.2f. ", totalSpent);
            System.out.printf("Remaining: $%.2f", currentBalance);
        }
    }
}
