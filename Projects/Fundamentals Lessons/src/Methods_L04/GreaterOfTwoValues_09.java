package Methods_L04;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("int")){
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(a, b));
        } else if (type.equals("char")){
            char firstLetter = scanner.nextLine().charAt(0);
            char secondLetter = scanner.nextLine().charAt(0);
            System.out.println(getMax(firstLetter, secondLetter));
        } else if (type.equals("string")) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();
            System.out.println(getMax(first, second));
        }
    }

    public static int getMax (int a, int b){
        if (a > b){
            return a;
        }
        return b;
    }
    public static char getMax (char firstLetter, char secondLetter){
        if (firstLetter > secondLetter){
            return firstLetter;
        }
        return secondLetter;
    }
    public static String getMax (String first, String second){
        if (first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }

}
