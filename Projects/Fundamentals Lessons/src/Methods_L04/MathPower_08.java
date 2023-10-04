package Methods_L04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(pow(number, power)));
    }

    public static double pow(double number, double power) {
       return Math.pow(number, power);
    }
}
