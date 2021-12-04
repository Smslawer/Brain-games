package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GameEven {
    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int COUNTER = 1;
    private static final int COUNT_OF_NUMBER = 50;

    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.NUMBER_OF_TRIES][2];
        for (int i = 0; i < Engine.NUMBER_OF_TRIES; i++) {
            int number = Utils.getRandomNumber(COUNT_OF_NUMBER);
            questionAndAnswer[i][0] = String.valueOf(number);
            questionAndAnswer[i][COUNTER] = ((number % 2) == 0) ? "yes" : "no";
        }

        Engine.compareAndOutput(DESCRIPTION, questionAndAnswer);

    }

}
