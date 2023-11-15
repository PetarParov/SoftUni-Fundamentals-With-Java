package RegularExpressions_L09;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // The regular expression for a valid phone number from Sofia
        String regex = "(?:^|\\s)\\+359(-|\\s)2\\1\\d{3}\\1\\d{4}\\b";
        // Create a pattern object from the regex
        Pattern pattern = Pattern.compile(regex);
        // Create a matcher object from the input
        Matcher matcher = pattern.matcher(input);

        List<String> matchedPhones = new LinkedList<>();

        while (matcher.find()) {
           matchedPhones.add(matcher.group());
        }
        System.out.println(String.join(",", matchedPhones));
    }
}