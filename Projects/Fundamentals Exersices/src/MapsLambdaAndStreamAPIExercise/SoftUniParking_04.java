package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingData = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {

            String command = scanner.nextLine();

            String[] commandArray = command.split(" ");
            String commandName = commandArray[0];
            String username = commandArray[1];

            if (commandName.equals("register")) {
                String plateNumber = commandArray[2];
                if (parkingData.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", parkingData.get(username));
                } else {
                    parkingData.put(username, plateNumber);
                    System.out.printf("%s registered %s successfully%n", username, plateNumber);
                }

            } else if (commandName.equals("unregister")) {
                if (!parkingData.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    parkingData.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }

        }

        for (Map.Entry<String, String> entry : parkingData.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
