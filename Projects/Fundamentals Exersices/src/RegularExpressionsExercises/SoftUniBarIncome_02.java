package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the regex pattern for a valid order
        String regex = "^%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$$";
        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        // Initialize the total income
        double income = 0.0;
        // Read the input until "end of shift"
        String input = scanner.nextLine();
        while (!input.equals("end of shift")) {
            // Try to match the input with the pattern
            Matcher matcher = pattern.matcher(input);
            // If there is a match, print the order and update the income
            if (matcher.find()) {
                String customer = matcher.group(1);
                String product = matcher.group(2);
                int count = Integer.parseInt(matcher.group(3));
                double price = Double.parseDouble(matcher.group(4));
                double totalPrice = count * price;
                System.out.printf("%s: %s - %.2f%n", customer, product, totalPrice);
                income += totalPrice;
            }
            // Read the next input
            input = scanner.nextLine();
        }
        // Print the total income
        System.out.printf("Total income: %.2f%n", income);
    }
}