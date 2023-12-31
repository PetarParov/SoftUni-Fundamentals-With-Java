package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] field = new int[Integer.parseInt(scanner.nextLine())];
        int[] indexes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int j : indexes) {
            if (j >= 0 && j < field.length) {
                field[j] = 1;
            }
        }
        String command;
        while (!(command = scanner.nextLine()).equals("end")) {
            String[] input = command.split(" ");
            int index = Integer.parseInt(input[0]);
            String direction = input[1];
            int flight = Integer.parseInt(input[2]);

            if (index < 0 || index >= field.length || field[index] == 0) {
                continue;
            }
            field[index] = 0;
            int currentFlight = flight;
            if (direction.equals("right")) {
                while (index + currentFlight < field.length && index + currentFlight >= 0) {
                    if (field[index + currentFlight] == 0) {
                        field[index + currentFlight] = 1;
                        break;
                    } else {
                        currentFlight += flight;
                    }
                }
            } else if (direction.equals("left")) {
                while (index - currentFlight >= 0 && index - currentFlight < field.length) {
                    if (field[index - currentFlight] == 0) {
                        field[index - currentFlight] = 1;
                        break;
                    } else {
                        currentFlight += flight;
                    }
                }
            }
        }
        for (int cell : field) {
            System.out.print(cell + " ");
        }
    }
}