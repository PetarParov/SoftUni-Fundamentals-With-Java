package DataTypesAndVariables_L02;

import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        long population = Long.parseLong(scanner.nextLine());
        int area = Integer.parseInt(scanner.nextLine());

        System.out.printf ("Town %s has population of %d and area %d square km.", name,population, area);
    }
}
