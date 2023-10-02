package ArraysExercise;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

            for (int i = 0; i < n; i++) {
                int countPeople = Integer.parseInt(scanner.nextLine());
                sum += countPeople;
                System.out.print(countPeople + " ");
            }

        System.out.println();
        System.out.println(sum);

    }
}
