package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class GameEven {
    public static void even() {
        int counter = 0;
        String correctAnswer = "'no'";
        String usersAnswer = "";

        Engine.greet();

        if (Engine.getUsersName().equals("")) {
            return;
        }

        Scanner trueAnswer = new Scanner(System.in);

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        while (counter < Engine.getNumberOfTrueTries()) {
            int number = (int) (Math.random() * Engine.getNumberOfTrueTries());
            System.out.println("Question: " + number);
            usersAnswer = trueAnswer.nextLine();
            System.out.println("Your answer: " + usersAnswer);

            if (number % 2 == 0) {
                correctAnswer = "'yes'";
            }

            if ((number % 2 == 0 && usersAnswer.equals("yes")) || (number % 2 != 0 && usersAnswer.equals("no"))) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("'" + usersAnswer + "'" + " is wrong answer ;(. Correct answer was " + correctAnswer
                        + ".\n" + "Let's try again, " + Engine.getUsersName() + "!");
                counter = 0;
            }
        }
        System.out.println("Congratulations, " + Engine.getUsersName() + "!");
        counter = 0;

    }

}
