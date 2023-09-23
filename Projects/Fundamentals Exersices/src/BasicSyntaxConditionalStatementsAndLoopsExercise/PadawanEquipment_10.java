package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double sumLightsabers = Math.ceil(countStudents + (0.1 * countStudents)) * priceLightsaber;
        double sumRobes = countStudents * priceRobe;
        double sumBelts = (countStudents - countStudents / 6) * priceBelt;

        double totalSum = sumLightsabers + sumRobes + sumBelts;
        double diff = Math.abs(budget-totalSum);

        if (budget >= totalSum){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
