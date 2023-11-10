package TextProcessingExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {

            isValidUsername (username);

        }
    }

    private static void isValidUsername(String username) {
        if (username.length() >=3 && username.length() <=16){
            Pattern pattern = Pattern.compile("^[A-Za-z0-9_-]*$");
            Matcher m = pattern.matcher(username);
            if (m.find()){
                System.out.println(username);
            }
        }
    }
}
