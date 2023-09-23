package DataTypesAndVariables_L02;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ch1 = scanner.nextLine();
        String ch2 = scanner.nextLine();
        String ch3= scanner.nextLine();

        System.out.printf("%s%s%s", ch1, ch2, ch3);
    }
}
