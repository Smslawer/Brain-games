package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    static final String DESCRIPTION = "What is the result of the expression?";
    static final int COUNTER = 1;

    public static void calculate() {
        String[][] questionAndAnswer = new String[Engine.getNumberOfTrueTries()][2];
        for (int i = 0; i < Engine.getNumberOfTrueTries(); i++) {
            int firstNumber = (int) (1 + Math.random() * Engine.getCountOfNumbers());
            int secondNumber = (int) (1 + Math.random() * Engine.getCountOfNumbers());
            String randomOperator = Engine.getOperator();
            String expression = firstNumber + " " + randomOperator + " " + secondNumber;
            for (int k = 0; k < questionAndAnswer[i].length; k++) {
                if (randomOperator.equals("+")) {
                    questionAndAnswer[i][k] = expression;
                    int tmp = firstNumber + secondNumber;
                    questionAndAnswer[i][COUNTER] = String.valueOf(tmp);
                }
                if (randomOperator.equals("-")) {
                    questionAndAnswer[i][k] = expression;
                    int tmp = firstNumber - secondNumber;
                    questionAndAnswer[i][COUNTER] = String.valueOf(tmp);
                }
                if (randomOperator.equals("*")) {
                    questionAndAnswer[i][k] = expression;
                    int tmp = firstNumber * secondNumber;
                    questionAndAnswer[i][COUNTER] = String.valueOf(tmp);
                }
                if (randomOperator.equals("/")) {
                    questionAndAnswer[i][k] = expression;
                    int tmp = firstNumber / secondNumber;
                    questionAndAnswer[i][COUNTER] = String.valueOf(tmp);
                }
            }
        }

        Engine.greet(DESCRIPTION, questionAndAnswer);
    }

}
