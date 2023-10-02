package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {

        public static void printTopIntegers(int[] array) {
            // A variable to store the current maximum element
            int max = Integer.MIN_VALUE;
            // A string builder to store the output
            StringBuilder output = new StringBuilder();
            // Loop through the array from right to left
            for (int i = array.length - 1; i >= 0; i--) {
                // If the current element is bigger than the current maximum
                if (array[i] > max) {
                    // Update the current maximum
                    max = array[i];
                    // Append the current element to the output
                    output.append(max + " ");
                }
            }
            // Reverse the output to get the correct order
            output.reverse();
            // Print the output
            System.out.println(output);
        }

// A main method to test the program
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // An example array

            int [] array = Arrays
                    .stream(scanner.nextLine()
                            .split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();

            // Call the method to print the top integers
            printTopIntegers(array);
        }

    }

