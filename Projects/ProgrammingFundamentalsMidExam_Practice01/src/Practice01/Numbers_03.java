package Practice01;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        int average = 0;
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            average = sum / numbers.size();
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > average){
                result.add(numbers.get(i));
            }
        }

        Collections.sort(result);
        Collections.reverse(result);

        if (result.isEmpty()){
            System.out.println("No");
        } else if (result.size() > 5){
            int first = result.get(0);
            int second = result.get(1);
            int third = result.get(2);
            int fourth = result.get(3);
            int fifth = result.get(4);

            System.out.println(first + " " + second + " " + third + " " + fourth + " " + fifth);
        } else {
            System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
