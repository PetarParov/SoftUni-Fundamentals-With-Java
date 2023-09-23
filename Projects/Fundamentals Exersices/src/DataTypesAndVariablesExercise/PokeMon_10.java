package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        // Create a Scanner object to read the input
        Scanner scanner = new Scanner(System.in);

        // Read the poke power, the distance, and the exhaustion factor
        int pokePower = scanner.nextInt();
        int distance = scanner.nextInt();
        int exhaustionFactor = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Initialize the count of poked targets and the original poke power
        int pokedTargets = 0;
        int originalPokePower = pokePower;

        // Loop until the poke power becomes less than the distance
        while (pokePower >= distance) {
            // Subtract the distance from the poke power
            pokePower -= distance;

            // Increment the count of poked targets
            pokedTargets++;

            // Check if the poke power is exactly 50% of its original value and the exhaustion factor is not zero
            if (pokePower == originalPokePower / 2 && exhaustionFactor != 0) {
                // Divide the poke power by the exhaustion factor
                pokePower /= exhaustionFactor;
            }
        }

        // Print the remaining poke power and the count of poked targets
        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}
