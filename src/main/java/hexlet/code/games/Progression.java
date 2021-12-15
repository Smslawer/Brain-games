package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int COUNTER = 1;
    private static final int STARTOFPROGRESSION = 5;
    private static final int STEPOFPROGRESSION = 2;
    private static final int COUNT_OF_NUMBER = 20;

    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.NUMBER_OF_TRIES][2];
        for (int i = 0; i < Engine.NUMBER_OF_TRIES; i++) {
            int arrLength = (int) (STARTOFPROGRESSION + Math.random() * Utils.getRandomNumber(COUNT_OF_NUMBER));
            String[] progression = setProgression(arrLength, Utils.getRandomNumber(COUNT_OF_NUMBER), STEPOFPROGRESSION);
            Random random = new Random();
            int correctAnswer = random.nextInt(progression.length);
            questionAndAnswer[i][0] = generateQuestion(progression, correctAnswer);
            questionAndAnswer[i][COUNTER] = String.valueOf(progression[correctAnswer]);
        }
        Engine.start(DESCRIPTION, questionAndAnswer);
    }

    private static String[] setProgression(int arrLength, int firstElement, int step) {
        String[] sum = new String[arrLength + 1];
        for (int j = 0; j <= arrLength; j++) {
            firstElement += step;
            sum[j] = String.valueOf(firstElement);
        }
        return sum;
    }

    private static String generateQuestion(String[] progression, int correctAnswer) {
        String question = "";
        for (String number : progression) {
            question = String.join(" ", question, number);
            if (number.equals(progression[correctAnswer])) {
                question = String.join(".. ", question, number).replaceAll(number, "").trim();
            }
        }
        return question;
    }
}

