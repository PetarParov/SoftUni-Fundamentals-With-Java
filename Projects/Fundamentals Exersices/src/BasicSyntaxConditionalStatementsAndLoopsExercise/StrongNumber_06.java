package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number; //първоначална стойност на числото, която не променям

        //взимаме последната цифра
        //обработваме я
        //премахваме последната цифра и т.н.
        // не знаем колко пъти ще се повтаря действието
        //while цикъл
        // спираме, когато числото стане <= 0;
        // продължаваме когато числото е по-голямо от 0;

        int sumFact = 0;

        while (number > 0){
            int lastDigit = number % 10;
            int fact = 1; //faktoriel na cifrata
            for (int i = 1; i <= lastDigit ; i++) {   //намиране на факториел
                fact = fact * i;
            }
            sumFact += fact;
            number = number / 10;
        }

        if (startNumber == sumFact){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
