package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine()); // прочитаме броя линии
        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split(" "); // четем линия и отделяме стринговете при интервал
            long left = Long.parseLong(input[0]); // парсваме лявото число
            long right = Long.parseLong(input[1]); // парсваме дясното число

            long biggest = Math.max(left, right);
            long sum = 0;

            while (biggest != 0) {
                sum += biggest % 10;
                biggest /= 10;
            }
            System.out.println(Math.abs(sum));

        }
    }
}
