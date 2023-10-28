package ObjectsAndClassesExercise.OpinionPoll_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String personalData = scanner.nextLine();
            String[] array = personalData.split(" ");
            String name = array[0];
            int age = Integer.parseInt(array[1]);

            if (age > 30) {
                Person person = new Person(name, age);
                personList.add(person);
            }
        }

        for (Person person :
                personList) {
            System.out.printf("%s - %d%n", person.getName(), person.getAge());
        }
    }
}
