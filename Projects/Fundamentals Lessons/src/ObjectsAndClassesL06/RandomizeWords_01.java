package ObjectsAndClassesL06;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Random;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> result = new ArrayList<>();

        Random rand = new Random();

        int inputLen = input.size();

        for (int i = 0; i < inputLen; i++) {
            int index = rand.nextInt(input.size());
            result.add(input.get(index));
            input.remove(index);
        }

        for (String word :
                result) {
            System.out.println(word);
        }

    }
}
