package Practice01;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int firstEmployeeCountStudentsPerHour = Integer.parseInt(scanner.nextLine());
       int secondEmployeeCountStudentsPerHour = Integer.parseInt(scanner.nextLine());
       int thirdEmployeeCountStudentsPerHour = Integer.parseInt(scanner.nextLine());

       int countStudents = Integer.parseInt(scanner.nextLine());

       int totalCountStudentsPerHour = firstEmployeeCountStudentsPerHour
               + secondEmployeeCountStudentsPerHour + thirdEmployeeCountStudentsPerHour;


       int hours = 0;

       while (countStudents > 0){

           countStudents -= totalCountStudentsPerHour;
           hours++;

           if (hours % 4 == 0){
               hours++;
           }
       }
        System.out.printf("Time needed: %dh.", hours);

    }
}
