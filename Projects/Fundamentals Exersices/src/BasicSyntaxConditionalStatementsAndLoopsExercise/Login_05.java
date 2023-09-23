package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }
        int counter = 0;

        String input = scanner.nextLine();
        while (!input.equals(password)){
            counter++;
            if (counter == 4){
                System.out.printf("User %s blocked!", username);
                return; //return прекратява целия мейн метод, т.е. цялата програма, а brake прекратява само цикъла
                //и се изпълнява програмата надолу
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);
    }
}
