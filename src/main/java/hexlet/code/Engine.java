package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_OF_TRIES = 3;

    public static void start(String description, String[][] questionAndAnswer) {
        Scanner forGame = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        String currentName = forGame.nextLine();
        System.out.println("Hello, " + currentName + "!");
        System.out.println(description);
        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            System.out.println("Question: " + questionAndAnswer[i][0]);
            String usersAnswer = forGame.nextLine();
            System.out.println("Your answer: " + usersAnswer);
            if (usersAnswer.equals(questionAndAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usersAnswer + "'" + " is wrong answer. Correct answer was "
                        + "'" + questionAndAnswer[i][1] + "'" + ". Let's try again, " + currentName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + currentName + "!");
    }
}
