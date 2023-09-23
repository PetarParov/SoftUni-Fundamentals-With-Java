package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int restYield = 0;
        while (startingYield >= 100) {
            days++;
            restYield += startingYield - 26;
            startingYield -= 10;
        }
        if (days == 0) {
            System.out.println(days);
            System.out.println(restYield);
        } else {
            restYield -= 26;
            System.out.println(days);
            System.out.println(restYield);
        }
    }
}
