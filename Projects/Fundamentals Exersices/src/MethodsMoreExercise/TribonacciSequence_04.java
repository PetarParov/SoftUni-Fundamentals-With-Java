package MethodsMoreExercise;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class TribonacciSequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger[] result = TribonacciNumbers(n);

        System.out.println(Arrays.toString(result).replaceAll("[,\\[\\]]", ""));
    }
    private static BigInteger[] TribonacciNumbers(int n) {
        BigInteger[] result = new BigInteger[n];
        switch (n) {
            case 1:
                result[0] = BigInteger.ONE;
                break;
            case 2:
                result[0] = BigInteger.ONE;
                result[1] = BigInteger.ONE;
                break;
            case 3:
                result[0] = BigInteger.ONE;
                result[1] = BigInteger.ONE;
                result[2] = BigInteger.valueOf(2);
                break;
            default:
                result[0] = BigInteger.ONE;
                result[1] = BigInteger.ONE;
                result[2] = BigInteger.valueOf(2);
                for (int i = 3; i < n; i++) {
                    BigInteger currNum = result[i - 3].add(result[i - 2]).add(result[i - 1]);
                    result[i] = currNum;
                }
                break;
        }
        return result;
    }
}


