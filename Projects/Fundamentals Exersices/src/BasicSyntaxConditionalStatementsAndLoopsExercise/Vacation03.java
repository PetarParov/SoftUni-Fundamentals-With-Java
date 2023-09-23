package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double pricePerPerson = 0;
        double groupPrice = 0;

        switch (day){
            case "Friday":
                switch (groupType){
                    case "Students":
                        pricePerPerson = 8.45;
                        break;

                    case "Business":
                        pricePerPerson = 10.90;
                        break;

                    case "Regular":
                        pricePerPerson = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (groupType){
                    case "Students":
                        pricePerPerson = 9.80;
                        break;

                    case "Business":
                        pricePerPerson = 15.60;
                        break;

                    case "Regular":
                        pricePerPerson = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (groupType){
                    case "Students":
                        pricePerPerson = 10.46;
                        break;

                    case "Business":
                        pricePerPerson = 16;
                        break;

                    case "Regular":
                        pricePerPerson = 22.50;
                        break;
                }
                break;
        }
        groupPrice = pricePerPerson * countPeople;

        if (groupType.equals("Students") && countPeople >=30){
            groupPrice = groupPrice - (0.15 * groupPrice);
        } else if (groupType.equals("Business") && countPeople >=100){
            groupPrice = pricePerPerson * (countPeople - 10);
        } else if (groupType.equals("Regular") && countPeople >=10 && countPeople <=20){
            groupPrice = groupPrice - (0.05 * groupPrice);
        }

        System.out.printf("Total price: %.2f", groupPrice);

    }
}
