package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameGCD {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int COUNTER = 1;
    private static final int COUNT_OF_NUMBER = 100;

    public static void runGame() {

        String[][] questionAndAnswer = new String[Engine.NUMBER_OF_TRIES][2];
        for (int i = 0; i < Engine.NUMBER_OF_TRIES; i++) {
            int firstNumber = Utils.getRandomNumber(COUNT_OF_NUMBER);
            int secondNumber = Utils.getRandomNumber(COUNT_OF_NUMBER);
            String question = firstNumber + " " + secondNumber;
            questionAndAnswer[i][0] = question;
            int correctAnswer = isGCD(firstNumber, secondNumber);
            questionAndAnswer[i][COUNTER] = String.valueOf(correctAnswer);
        }

        Engine.start(DESCRIPTION, questionAndAnswer);
    }

    private static int isGCD(int firstNumber, int secondNumber) {
        int tmpAnswer = 0;
        while (secondNumber != 0) {
            int tmp = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = tmp;
            tmpAnswer = firstNumber;
        }

        return tmpAnswer;
    }
}
