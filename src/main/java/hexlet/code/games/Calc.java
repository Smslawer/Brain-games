package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    public static void calculate() {
        int counter = 0;
        int correctAnswer = 0;
        int usersAnswer = 0;

        Engine.greet();

        if (Engine.getUsersName().equals("")) {
            return;
        }

        Scanner trueAnswer = new Scanner(System.in);

        System.out.println("What is the result of the expression?");
        while (counter < Engine.getNumberOfTrueTries()) {
            int firstNumber = (int) (Math.random() * Engine.getCountOfNumbers());
            int secondNumber = (int) (Math.random() * Engine.getCountOfNumbers());
            String randomOperator = Engine.getOperator();
            String expression = firstNumber + " " + randomOperator + " " + secondNumber;
            System.out.println("Question: " + expression);
            if (trueAnswer.hasNextInt()) {
                usersAnswer = trueAnswer.nextInt();
                System.out.println("Your answer: " + usersAnswer);
            } else {
                System.out.println("Ответ должен быть числом! Перезапустите программу и попробуйте снова");
                return;
            }

            if (randomOperator.equals("+")) {
                correctAnswer = firstNumber + secondNumber;
            }
            if (randomOperator.equals("-")) {
                correctAnswer = firstNumber - secondNumber;
            }
            if (randomOperator.equals("*")) {
                correctAnswer = firstNumber * secondNumber;
            }
            if (randomOperator.equals("/")) {
                correctAnswer = firstNumber / secondNumber;
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
