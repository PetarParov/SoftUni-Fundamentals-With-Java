package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 0;

        for (int i = 1; i <= n ; i++) {
            int litres = Integer.parseInt(scanner.nextLine());
            capacity += litres;
            if (capacity > 255){
                System.out.println("Insufficient capacity!");
                capacity -= litres;
            }
        }
        System.out.println(capacity);
    }
}
