package ObjectsAndClassesL06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String command = scanner.nextLine();


        String firstName = "";
        String lastName = "";
        int age = 0;
        String hometown = "";

        while (!command.equals("end")) {
            String[] input = command.split(" ");
            firstName = input[0];
            lastName = input[1];
            age = Integer.parseInt(input[2]);
            hometown = input[3];

            Student student = new Student(firstName, lastName, age, hometown);
            students.add(student);
            command = scanner.nextLine();
        }

        String town = scanner.nextLine();

        for (Student student :
            students){
            if (student.getCity().equals(town)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }


    }
}
