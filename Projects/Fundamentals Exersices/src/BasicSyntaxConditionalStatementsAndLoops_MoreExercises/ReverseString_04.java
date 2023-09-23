package BasicSyntaxConditionalStatementsAndLoops_MoreExercises;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String result = "";
        char symbol;
        for (int i = 0; i < input.length(); i++) {
            symbol = input.charAt(i);
            result = symbol + result;
        }
        System.out.println(result);

    }
}
