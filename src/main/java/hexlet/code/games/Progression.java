package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

public class Progression {

    static final String DESCRIPTION = "What number is missing in the progression?";
    static final int COUNTER = 1;
    static final int STARTOFPROGRESSION = 5;
    public static void progress() {
        String[][] questionAndAnswer = new String[Engine.getNumberOfTrueTries()][2];
        for (int i = 0; i < Engine.getNumberOfTrueTries(); i++) {
            String question = "";
            int correctAnswer = 0;
            int[] progression =  setProgression();
            Random random = new Random();
            int it = random.nextInt(progression.length);
            for (int g = 0; g < progression.length; g++) {
                if (progression[g] == progression[it]) {
                    correctAnswer = progression[g];

                    int[] firstTmp = new int[g];
                    System.arraycopy(progression, 0, firstTmp, 0, g);
                    String firstArray = Arrays.toString(firstTmp);
                    firstArray = firstArray.substring(1, firstArray.length() - 1);

                    int[] secondTmp = new int[progression.length - (g + 1)];
                    System.arraycopy(progression, g + 1, secondTmp, 0, progression.length - (g + 1));
                    String secondArray = Arrays.toString(secondTmp);
                    secondArray = secondArray.substring(1, secondArray.length() - 1);
                    question = (firstArray + " .. " + secondArray).trim();
                    question = question.replaceAll("[,]", "");
                }
            }
            for (int k = 0; k < questionAndAnswer[i].length; k++) {
                questionAndAnswer[i][k] = question;
                questionAndAnswer[i][COUNTER] = String.valueOf(correctAnswer);
            }
        }
        Engine.greet(DESCRIPTION, questionAndAnswer);
    }

    private static int[] setProgression() {
        int arrLength = (int) (STARTOFPROGRESSION + Math.random() * Engine.getCountOfNumbers());
        int secondNumber = Engine.getRandomNumber();
        int[] sum = new int[arrLength + 1];
        for (int j = 0; j <= arrLength; j++) {
            secondNumber += 2;
            sum[j] = secondNumber;
        }
        return sum;
    }


}
