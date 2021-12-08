package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.math.BigInteger;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int COUNTER = 1;
    private static final int COUNT_OF_NUMBER = 30;

    public static void runGame() {
        String[][] questionAndAnswer = new String[Engine.NUMBER_OF_TRIES][2];
        for (int i = 0; i < Engine.NUMBER_OF_TRIES; i++) {
            Integer primeNumber = Utils.getRandomNumber(COUNT_OF_NUMBER);
            questionAndAnswer[i][0] = String.valueOf(primeNumber);
            questionAndAnswer[i][COUNTER] = (isProbablePrime(primeNumber)) ? "yes" : "no";
        }
        Engine.start(DESCRIPTION, questionAndAnswer);
    }

    private static boolean isProbablePrime(Integer primeNumber) {
        BigInteger bigInteger = BigInteger.valueOf(primeNumber);
        return bigInteger.isProbablePrime((int) Math.log(primeNumber));
    }
}
