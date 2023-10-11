package ListsLab_05;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> input = new ArrayList<>();
        String[] inputArr = scanner.nextLine().split(" ");
        for (String num : inputArr) {
            input.add(Double.parseDouble(num));
        }
        for (int i = 1; i < input.size(); i++) {
            if (input.get(i).equals(input.get(i - 1))) {
                input.set(i, input.get(i) + input.get(i - 1));
                input.remove(i - 1);
                i = 0;
            }
        }
        for (double num:
             input) {
            System.out.print(new DecimalFormat("0.###").format(num) + " ");
        }
    }
}
