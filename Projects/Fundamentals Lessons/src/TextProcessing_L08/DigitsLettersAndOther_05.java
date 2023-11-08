package TextProcessing_L08;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // read the input string
        StringBuilder digits = new StringBuilder(); // store the digits
        StringBuilder letters = new StringBuilder(); // store the letters
        StringBuilder others = new StringBuilder(); // store the other characters
        for (char c : input.toCharArray()) { // loop through each character
            if (Character.isDigit(c)) { // if the character is a digit
                digits.append(c); // append it to the digits string
            } else if (Character.isLetter(c)) { // if the character is a letter
                letters.append(c); // append it to the letters string
            } else { // otherwise
                others.append(c); // append it to the other characters string
            }
        }
        System.out.println(digits); // print the digits
        System.out.println(letters); // print the letters
        System.out.println(others); // print the other characters
    }
}