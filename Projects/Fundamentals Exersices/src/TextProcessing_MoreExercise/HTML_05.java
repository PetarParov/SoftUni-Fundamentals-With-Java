package TextProcessing_MoreExercise;

import java.util.Scanner;

public class HTML_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the title of the article
        String title = scanner.nextLine();

        // Read the content of the article
        String content = scanner.nextLine();

        // Print the title in h1 tag
        System.out.printf("<h1>%n    %s%n</h1>%n",title);

        // Print the content in article tag
        System.out.printf("<article>%n    %s%n</article>%n", content);

        // Read the comments until "end of comments"
        String comment = scanner.nextLine();
        while (!comment.equals("end of comments")) {
            // Print each comment in div tag
            System.out.printf("<div>%n    %s%n</div>%n", comment);
            // Read the next comment
            comment = scanner.nextLine();
        }
    }
}