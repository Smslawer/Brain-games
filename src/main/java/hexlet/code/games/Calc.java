package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    static final String DESCRIPTION = "What is the result of the expression?";
    static final int COUNTER = 1;

    public static void calculate() {
        String[][] questionAndAnswer = new String[Engine.getNumberOfTrueTries()][2];
        for (int i = 0; i < Engine.getNumberOfTrueTries(); i++) {
            int firstNumber = Engine.getRandomNumber();
            int secondNumber = Engine.getRandomNumber();
            String randomOperator = getOperator();
            String expression = firstNumber + " " + randomOperator + " " + secondNumber;
            for (int k = 0; k < questionAndAnswer[i].length; k++) {
                questionAndAnswer[i][k] = expression;
                questionAndAnswer[i][COUNTER] = String.valueOf(
                        getTrueAnswer(randomOperator, firstNumber, secondNumber));
            }
        }

        Engine.greet(DESCRIPTION, questionAndAnswer);
    }

    private static int getTrueAnswer(String randomOperator, int firstNumber, int secondNumber) {
        int tmp = 0;
        switch (randomOperator) {
            case "+" -> {
                tmp = firstNumber + secondNumber;
            }
            case "-" -> {
                tmp = firstNumber - secondNumber;
            }
            case "*" -> {
                tmp = firstNumber * secondNumber;
            }
            default -> System.out.println("Unexpected value");
        }
        return tmp;
    }

    private static String getOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        int i = random.nextInt(Engine.getNumberOfTrueTries());
        return operators[i];
    }

}
