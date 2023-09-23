package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String dataType = getDataType(input);
            System.out.println(input + " is " + dataType + " type");
            input = scanner.nextLine();
        }
    }
    public static String getDataType(String input) {
        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
            return "boolean";
        }
        try {
            Integer.parseInt(input);
            return "integer";
        } catch (NumberFormatException e) {
            // do nothing
        }
        try {
            Double.parseDouble(input);
            return "floating point";
        } catch (NumberFormatException e) {
            // do nothing
        }
        if (input.length() == 1) {
            return "character";
        }
        return "string";
    }
}
