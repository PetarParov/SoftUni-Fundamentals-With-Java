package ArraysLab_L03;

import java.util.Arrays;
import java.util.*;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = n-1; i >= 0 ; i--) {
            System.out.printf("%d ", numbers[i]);

        }
        System.out.printf("%n");
    }
}
