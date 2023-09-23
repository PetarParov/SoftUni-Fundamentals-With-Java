package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countBrokenHeadset = 0;
        int countBrokenMouse = 0;
        int countBrokenKeyboards = 0;
        int countBrokenDisplays = 0;
        int countTimesTrashesKeyboards = 0;

        for (int i = 1; i <= countLostGames ; i++) {
            if (i % 2 == 0){
                countBrokenHeadset++;
            } if (i % 3 == 0){
                countBrokenMouse++;
            } if (i % 2 == 0 && i % 3 ==0){
                countBrokenKeyboards++;
                countTimesTrashesKeyboards++;
                if (countTimesTrashesKeyboards % 2 == 0){
                    countBrokenDisplays++;
                }
            }
        }

        double sumHeadset = countBrokenHeadset * headsetPrice;
        double sumMouse = countBrokenMouse * mousePrice;
        double sumKeyboards = countBrokenKeyboards * keyboardPrice;
        double sumDisplays = countBrokenDisplays * displayPrice;

        double totalSum = sumHeadset + sumDisplays + sumMouse + sumKeyboards;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);

    }
}
