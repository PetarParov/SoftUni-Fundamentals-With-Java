package Practice01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> array= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("swap")) {
                String[] swapArray = command.split(" ");
                int firstSwapIndex = Integer.parseInt(swapArray[1]);
                int secondSwapIndex = Integer.parseInt(swapArray[2]);
                Collections.swap(array, firstSwapIndex, secondSwapIndex);

            } else if (command.contains("multiply")) {
                String[] multiplyArray = command.split(" ");
                int firstMultiplyIndex = Integer.parseInt(multiplyArray[1]);
                int secondMultiplyIndex = Integer.parseInt(multiplyArray[2]);
                array.set(firstMultiplyIndex,array.get(firstMultiplyIndex)*array.get(secondMultiplyIndex));

            } else if (command.contains("decrease")) {
                IntStream.range(0, array.size()).forEach(i -> array.set(i,array.get(i)-1));
            }
            command = scanner.nextLine();
        }
        System.out.print(Arrays.toString(new List[]{array}).replaceAll("[\\[\\]]", ""));
    }
}
