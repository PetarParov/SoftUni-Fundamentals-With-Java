package RegularExpressions_MoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RageQuit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // read the input line
        Pattern pattern = Pattern.compile("(\\D*)(\\d+)"); // create a regex pattern to match string-number pairs
        Matcher matcher = pattern.matcher(input); // create a matcher to find matches in the input
        StringBuilder output = new StringBuilder(); // create a string builder to store the output
        int uniqueSymbols = 0; // create a variable to count the unique symbols used

        while (matcher.find()) { // loop through all the matches
            String str = matcher.group(1); // get the string part of the match
            int num = Integer.parseInt(matcher.group(2)); // get the number part of the match
            for (int i = 0; i < num; i++) { // repeat the string num times
                output.append(str.toUpperCase()); // append the string in uppercase to the output
            }
        }

        uniqueSymbols = (int) output.toString().chars().distinct().count(); // count the number of distinct characters in the output

        System.out.println("Unique symbols used: " + uniqueSymbols); // print the number of unique symbols used
        System.out.println(output); // print the output
    }
}