package DataTypesAndVariables_L02;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int metres = Integer.parseInt(scanner.nextLine());

        double km = (double) metres / 1000;

        System.out.printf("%.2f", km);
    }
}
