package BasicSyntaxConditionalStatementsAndLoops_L01;

import java.util.Scanner;

public class MultiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int start = Integer.parseInt(scanner.nextLine());
        int product = num * start;

        if (start > 10){
            System.out.printf("%d X %d = %d%n", num, start, product);
        } else {
            for (int i = start; i <= 10; i++) {
                int result = num * i;
                System.out.printf("%d X %d = %d%n", num, i, result);
            }
        }
    }
}
