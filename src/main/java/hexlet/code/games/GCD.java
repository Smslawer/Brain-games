package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    static final int COUNTER = 1;

    public static void divisor() {

        String[][] questionAndAnswer = new String[Engine.getNumberOfTrueTries()][2];
        for (int i = 0; i < Engine.getNumberOfTrueTries(); i++) {
            int firstNumber = Engine.getRandomNumber();
            int secondNumber = Engine.getRandomNumber();
            String commonDivisor = firstNumber + " " + secondNumber;
            for (int k = 0; k < questionAndAnswer[i].length; k++) {
                questionAndAnswer[i][k] = commonDivisor;
                int correctAnswer = isGCD(firstNumber, secondNumber);
                questionAndAnswer[i][COUNTER] = String.valueOf(correctAnswer);
            }
        }
        Engine.greet(DESCRIPTION, questionAndAnswer);

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
