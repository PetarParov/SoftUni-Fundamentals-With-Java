package ArraysExercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String [] firstArray = firstRow.split(" ");
        String [] secondArray = secondRow.split(" ");

        for ( String element2 : secondArray){
            for (String element1 : firstArray){
                if (element1.equals(element2)){
                    System.out.print(element1 + " ");
                }
            }
        }
    }
}
