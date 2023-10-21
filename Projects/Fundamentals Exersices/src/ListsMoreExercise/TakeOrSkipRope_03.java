package ListsMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeOrSkipRope_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        List<String> nonNumbers = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                numbers.add(Integer.parseInt(String.valueOf(word.charAt(i))));
            } else {
                nonNumbers.add(String.valueOf(word.charAt(i)));
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(numbers.get(i));
            } else {
                skipList.add(numbers.get(i));
            }
        }
        int indexForSkip = 0;
        for (int i = 0; i < takeList.size(); i++) {
            List<String> temp = new ArrayList<>(nonNumbers);
            temp = temp.stream().skip(indexForSkip).limit(takeList.get(i)).collect(Collectors.toList());
            result.append(String.join("", temp));
            indexForSkip += takeList.get(i) + skipList.get(i);
        }
        System.out.println(result);
    }
}