package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    static final int COUNTER = 1;

    public static void divisor() {

        String[][] questionAndAnswer = new String[Engine.getNumberOfTrueTries()][2];
        for (int i = 0; i < Engine.getNumberOfTrueTries(); i++) {
            int firstNumber = (int) (1 + Math.random() * Engine.getCountOfNumbers());
            int secondNumber = (int) (1 + Math.random() * Engine.getCountOfNumbers());
            String commonDivisor = firstNumber + " " + secondNumber;
            int correctAnswer = 0;
            for (int k = 0; k < questionAndAnswer[i].length; k++) {
                questionAndAnswer[i][k] = commonDivisor;
                while (secondNumber != 0) {
                    int tmp = firstNumber % secondNumber;
                    firstNumber = secondNumber;
                    secondNumber = tmp;
                    correctAnswer = firstNumber;
                }
                questionAndAnswer[i][COUNTER] = String.valueOf(correctAnswer);
            }
        }
        Engine.greet(DESCRIPTION, questionAndAnswer);

    }

}
