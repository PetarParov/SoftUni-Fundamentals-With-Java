package ListsMoreExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MixedUpLists_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputOne = new ArrayList<>();
        String[] inputOneStr = scanner.nextLine().split(" ");

        for (String str : inputOneStr) {
            inputOne.add(Integer.parseInt(str));
        }

        List<Integer> inputTwo = new ArrayList<>();
        String[] inputTwoStr = scanner.nextLine().split(" ");
        for (String str : inputTwoStr) {
            inputTwo.add(Integer.parseInt(str));
        }

        List<Integer> rule = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();
        List<Integer> mixedList = new ArrayList<>();

        if (inputOne.size() > inputTwo.size()) {
            maxList = inputOne;
        } else {
            maxList = inputTwo;
            Collections.reverse(maxList);
        }

        for (int i = maxList.size() - 2; i < maxList.size(); i++) {
            rule.add(maxList.get(i));
        }

        Collections.sort(rule);

        if (inputOne.size() > inputTwo.size()) {
            inputOne.subList(inputOne.size() - 2, inputOne.size()).clear();
            Collections.reverse(inputTwo);
        } else {
            inputTwo.subList(inputTwo.size() - 2, inputTwo.size()).clear();
            Collections.reverse(inputTwo);
        }

        for (int i = 0; i < inputOne.size(); i++) {
            mixedList.add(inputOne.get(i));
            mixedList.add(inputTwo.get(i));
        }

        List<Integer> output = new ArrayList<>();
        for (int x : mixedList) {
            if (x > rule.get(0) && x < rule.get(1)) {
                output.add(x);
            }
        }

        Collections.sort(output);

        for (int x : output) {
            System.out.print(x + " ");
        }
    }
}