package hexlet.code.games;

import hexlet.code.Engine;

public class GameEven {
    static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    static final int COUNTER = 1;
    public static void even() {
        String[][] questionAndAnswer = new String[Engine.getNumberOfTrueTries()][2];
        for (int i = 0; i < Engine.getNumberOfTrueTries(); i++) {
            int number = (int) (1 + Math.random() * Engine.getCountOfNumbers());
            for (int k = 0; k < questionAndAnswer[i].length; k++) {
                questionAndAnswer[i][k] = String.valueOf(number);
                questionAndAnswer[i][COUNTER] = ((number % 2) == 0) ? "yes" : "no";
            }
        }

        Engine.greet(DESCRIPTION, questionAndAnswer);

    }

}
