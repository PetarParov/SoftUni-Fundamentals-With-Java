package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int lastIndex= input.lastIndexOf("\\");

        String file = input.substring(lastIndex + 1);

        String [] fileArr = file.split("\\.");

        String fileName = fileArr[0];
        String fileType = fileArr[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", fileType);

    }
}
