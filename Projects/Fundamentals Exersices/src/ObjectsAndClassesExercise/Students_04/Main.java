package ObjectsAndClassesExercise.Students_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String studentData = scanner.nextLine();
            String [] input = studentData.split(" ");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);
            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }
        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade) //ascending order
                .reversed()); //descending order
        for (Student student:
             studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }

    }
}
