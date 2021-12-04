package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final int COUNTER = 1;
    private static final int COUNT_OF_NUMBER = 20;

    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.NUMBER_OF_TRIES][2];
        for (int i = 0; i < Engine.NUMBER_OF_TRIES; i++) {
            int firstNumber = Utils.getRandomNumber(COUNT_OF_NUMBER);
            int secondNumber = Utils.getRandomNumber(COUNT_OF_NUMBER);
            String randomOperator = getOperator();
            String question = firstNumber + " " + randomOperator + " " + secondNumber;
            for (int k = 0; k < questionAndAnswer[i].length; k++) {
                questionAndAnswer[i][k] = question;
                questionAndAnswer[i][COUNTER] = String.valueOf(
                        getTrueAnswer(randomOperator, firstNumber, secondNumber));
            }
        }

        Engine.compareAndOutput(DESCRIPTION, questionAndAnswer);
    }

    private static int getTrueAnswer(String randomOperator, int firstNumber, int secondNumber) {
        int answer = 0;
        switch (randomOperator) {
            case "+" -> {
                answer = firstNumber + secondNumber;
            }
            case "-" -> {
                answer = firstNumber - secondNumber;
            }
            case "*" -> {
                answer = firstNumber * secondNumber;
            }
            default -> System.out.println("Unexpected value");
        }
        return answer;
    }

    private static String getOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        int i = random.nextInt(Engine.NUMBER_OF_TRIES);
        return operators[i];
    }

}
