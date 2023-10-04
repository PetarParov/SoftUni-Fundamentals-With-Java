package Methods_L04;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printTriangle(n);
    }

    static void printLine(int end) {
        for (int i = 1; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printTriangle(int n) {
        for (int line = 1; line <= n; line++) {
            printLine(line);
        }
        for (int line = n - 1; line >= 1; line--) {
            printLine(line);
        }
    }
}