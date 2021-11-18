package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void divisor() {
        int counter = 0;
        int correctAnswer = 0;
        int usersAnswer = 0;
        Engine.greet();

        if (Engine.getUsersName().equals("")) {
            return;
        }
        Scanner trueAnswer = new Scanner(System.in);

        System.out.println("Find the greatest common divisor of given numbers.");
        while (counter < Engine.getNumberOfTrueTries()) {
            int firstNumber = (int) (1 + Math.random() * Engine.getCountOfNumbers());
            int secondNumber = (int) (1 + Math.random() * Engine.getCountOfNumbers());
            String commonDivisor = firstNumber + " " + secondNumber;
            System.out.println("Question: " + commonDivisor);
            if (trueAnswer.hasNextInt()) {
                usersAnswer = trueAnswer.nextInt();
                System.out.println("Your answer: " + usersAnswer);
            } else {
                System.out.println("Ответ должен быть числом! Перезапустите программу и попробуйте снова");
                return;
            }
            while (secondNumber != 0) {
                int tmp = firstNumber % secondNumber;
                firstNumber = secondNumber;
                secondNumber = tmp;
                correctAnswer = firstNumber;
            }
            if (correctAnswer == usersAnswer) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("'" + usersAnswer + "'" + " is wrong answer. Correct answer was "
                        + "'" + correctAnswer + "'" + ". Let's try again, " + Engine.getUsersName() + "!");
                counter = 0;
            }
        }
        System.out.println("Congratulations, " + Engine.getUsersName() + "!");
        counter = 0;

    }

}
