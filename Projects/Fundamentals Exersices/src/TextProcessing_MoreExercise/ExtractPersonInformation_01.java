package TextProcessing_MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of lines
        int n = Integer.parseInt(scanner.nextLine());

        // Define the regex patterns for name and age
        Pattern namePattern = Pattern.compile("@(.+?)\\|");
        Pattern agePattern = Pattern.compile("#(.+?)\\*");

        // Loop through the lines
        for (int i = 0; i < n; i++) {
            // Read the line
            String line = scanner.nextLine();
            // Find the name and age using the patterns
            Matcher nameMatcher = namePattern.matcher(line);
            Matcher ageMatcher = agePattern.matcher(line);
            // If both name and age are found, print the output
            if (nameMatcher.find() && ageMatcher.find()) {
                String name = nameMatcher.group(1);
                String age = ageMatcher.group(1);
                System.out.println(name + " is " + age + " years old.");
            }
        }
    }
}