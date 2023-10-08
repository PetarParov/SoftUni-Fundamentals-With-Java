package ArraysMoreExercise;

import java.util.Arrays;

import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        long[][] pascalTriangle = new long[lines][];
        for (int row = 0; row < lines; row++) {
            pascalTriangle[row] = new long[row + 1];
            pascalTriangle[row][0] = 1;
            pascalTriangle[row][pascalTriangle[row].length - 1] = 1;
            for (int col = 1; col < row; col++) {
                pascalTriangle[row][col] = pascalTriangle[row - 1][col - 1] + pascalTriangle[row - 1][col];
            }
        }
        for (int row = 0; row < lines; row++) {

            System.out.println(Arrays.toString(pascalTriangle[row])
                    .replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .trim() + " ");           //remove );
        }
    }
}