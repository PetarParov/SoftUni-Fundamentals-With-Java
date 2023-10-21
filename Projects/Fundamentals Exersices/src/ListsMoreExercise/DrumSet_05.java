package ListsMoreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DrumSet_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double savings = Double.parseDouble(reader.readLine());

        List<Integer> drumSet = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> quality = new ArrayList<>();

        for (int i = 0; i < drumSet.size(); i++) {
            quality.add(drumSet.get(i));
        }

        String command = "";

        while (!"Hit it again, Gabsy!".equals(command = reader.readLine())) {
            int currentPower = Integer.parseInt(command);

            for (int i = 0; i < drumSet.size(); i++) {
                drumSet.set(i, drumSet.get(i) - currentPower);
            }

            for (int i = 0; i < drumSet.size(); i++) {

                if (drumSet.get(i) <= 0) {

                    if (savings - (quality.get(i) * 3) > 0) {
                        drumSet.set(i, quality.get(i));
                        savings -= (quality.get(i) * 3);
                    } else {
                        drumSet.remove(i);
                        quality.remove(i);
                    }
                }
            }
        }

        for (Integer drum : drumSet) {
            System.out.print(drum + " ");
        }
        System.out.println();

        System.out.printf("Gabsy has %.2flv.", savings);
    }
}