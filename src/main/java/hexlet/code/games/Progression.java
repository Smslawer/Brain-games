package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;
import java.util.Random;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int COUNTER = 1;
    private static final int STARTOFPROGRESSION = 5;
    private static final int COUNT_OF_NUMBER = 20;

    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.NUMBER_OF_TRIES][2];
        for (int i = 0; i < Engine.NUMBER_OF_TRIES; i++) {
            int[] progression = setProgression();
            Random random = new Random();
            int correctAnswer = random.nextInt(progression.length);
            questionAndAnswer[i][0] = generateQuestion(progression, correctAnswer);
            questionAndAnswer[i][COUNTER] = String.valueOf(progression[correctAnswer]);
        }
        Engine.compareAndOutput(DESCRIPTION, questionAndAnswer);
    }

    private static int[] setProgression() {
        int arrLength = (int) (STARTOFPROGRESSION + Math.random() * Utils.getRandomNumber(COUNT_OF_NUMBER));
        int secondNumber = Utils.getRandomNumber(COUNT_OF_NUMBER);
        int[] sum = new int[arrLength + 1];
        for (int j = 0; j <= arrLength; j++) {
            secondNumber += 2;
            sum[j] = secondNumber;
        }
        return sum;
    }

    private static String generateQuestion(int[] progression, int correctAnswer) {
        String question = "";
        for (int g = 0; g < progression.length; g++) {
            if (progression[g] == progression[correctAnswer]) {

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
        return question;
    }
}

