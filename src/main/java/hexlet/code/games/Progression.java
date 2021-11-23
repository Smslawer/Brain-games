package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

public class Progression {

    static final String DESCRIPTION = "What number is missing in the progression?";
    static final int COUNTER = 1;
    public static void progress() {
        String[][] questionAndAnswer = new String[Engine.getNumberOfTrueTries()][2];
        for (int i = 0; i < Engine.getNumberOfTrueTries(); i++) {
            String question = "";
            int correctAnswer = 0;
            int firstNumber = Engine.getFirstNumber();
            int secondNumber = Engine.getSecondNumber();
            int[] sum = new int[firstNumber + 1];
            for (int j = 0; j <= firstNumber; j++) {
                secondNumber += 2;
                sum[j] = secondNumber;
            }
            Random random = new Random();
            int it = random.nextInt(sum.length);
            for (int g = 0; g < sum.length; g++) {
                if (sum[g] == sum[it]) {
                    correctAnswer = sum[g];

                    int[] firstTmp = new int[g];
                    System.arraycopy(sum, 0, firstTmp, 0, g);
                    String firstArray = Arrays.toString(firstTmp);
                    firstArray = firstArray.substring(1, firstArray.length() - 1);

                    int[] secondTmp = new int[sum.length - (g + 1)];
                    System.arraycopy(sum, g + 1, secondTmp, 0, sum.length - (g + 1));
                    String secondArray = Arrays.toString(secondTmp);
                    secondArray = secondArray.substring(1, secondArray.length() - 1);
                    question = firstArray + " . . " + secondArray;
                }
            }
            for (int k = 0; k < questionAndAnswer[i].length; k++) {
                questionAndAnswer[i][k] = question;
                questionAndAnswer[i][COUNTER] = String.valueOf(correctAnswer);
            }
        }
        Engine.greet(DESCRIPTION, questionAndAnswer);
    }

}
