package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {
    public static void isPrime() {
        int counter = 0;
        String correctAnswer = "no";
        String usersAnswer = "";
        Engine.greet();

        if (Engine.getUsersName().equals("")) {
            return;
        }
        Scanner trueAnswer = new Scanner(System.in);

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'");
        while (counter < Engine.getNumberOfTrueTries()) {
            Integer primeNumber = (Integer) Engine.getFirstNumber();
            System.out.println("Question: " + primeNumber);
            if (trueAnswer.hasNextInt()) {
                System.out.println("Answer must be 'yes' or 'no'! Let's tru again, " + Engine.getUsersName());
                return;
            } else {
                usersAnswer = trueAnswer.nextLine();
                System.out.println("Your answer: " + usersAnswer);
            }

            BigInteger bigInteger = BigInteger.valueOf(primeNumber);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(primeNumber));

            if (probablePrime) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (correctAnswer.equals(usersAnswer)) {
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
        correctAnswer = "";

    }

}
