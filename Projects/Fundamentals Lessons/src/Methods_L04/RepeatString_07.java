package Methods_L04;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int counter = Integer.parseInt(scanner.nextLine());

        String result = repeatString(text, counter);
        System.out.println(result);

    }

    public static String repeatString(String text, int counter) {
        String[] result = new String[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = text;
        }
        return String.join("", result);
    }

}
