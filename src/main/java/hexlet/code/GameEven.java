package hexlet.code;

import java.util.Scanner;

public class GameEven {
    public static void even() {
        int counter = 0;
        final int numberOfTrueTries = 3;
        final int countOfNumbers = 100;
        String currentName = "";
        String correctAnswer = "'no'";

        Scanner usersName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        if (!usersName.hasNextInt()) {
            String user =  usersName.nextLine();
            currentName = user;
            System.out.println("Hello, " + user + "!");
        } else {
            System.out.println("Извините, имя не может быть числом или знаком! "
                    + "Перезапустите программу и попробуйте снова");
        }

        Scanner trueAnswer = new Scanner(System.in);

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        while (counter < numberOfTrueTries) {
            int number = (int) (Math.random() * countOfNumbers);
            System.out.println("Question: " + number);
            String answer = trueAnswer.nextLine();
            System.out.println("Your answer: " + answer);

            if (number % 2 == 0) {
                correctAnswer = "'yes'";
            }

            if ((number % 2 == 0 && answer.equals("yes")) || (number % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + correctAnswer
                        + ".\n" + "Let's try again, " + currentName + "!");
                counter = 0;
            }
        }
        System.out.println("Congratulations, " + currentName + "!");

    }

}
