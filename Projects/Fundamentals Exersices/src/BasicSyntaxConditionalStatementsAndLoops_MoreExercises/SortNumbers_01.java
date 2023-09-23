package BasicSyntaxConditionalStatementsAndLoops_MoreExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        num.add(num1);
        num.add(num2);
        num.add(num3);

        Collections.sort(num, Collections.reverseOrder());

        for(Integer result: num){
            System.out.println(result);
        }

    }
}
