package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 1; i <= countStudents; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentGrades.containsKey(studentName)) {
                List<Double> currentGrades = studentGrades.get(studentName);
                currentGrades.add(grade);

            } else {
                studentGrades.put(studentName, new ArrayList<>());
                studentGrades.get(studentName).add(grade);    //достъпваме списъкът с оценки, който стои срещу студента и добавяме оценката

            }
        }

        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry :
                studentGrades.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double average = getAverageGrade(grades);

            if (average >= 4.50) {
                studentAverageGrade.put(studentName, average);
            }
        }

        studentAverageGrade.entrySet()
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade(List<Double> grades) {
        double sum = 0;
        for (double grade :
                grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}



