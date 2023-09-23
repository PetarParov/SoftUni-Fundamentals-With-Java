package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double topValue = Double.MIN_VALUE;
        int topSnow = 0;
        int topTime= 0;
        int topQuality = 0;

        for (int i = 1; i <= n ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double value = Math.pow((double) snowballSnow / snowballTime, snowballQuality);
            if (value > topValue){
                topValue = value;
                topSnow = snowballSnow;
                topTime = snowballTime;
                topQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", topSnow, topTime, topValue, topQuality);

    }
}
