package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public class Prime {
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    static final int COUNTER = 1;

    public static void isPrime() {
        String[][] questionAndAnswer = new String[Engine.getNumberOfTrueTries()][2];
        for (int i = 0; i < Engine.getNumberOfTrueTries(); i++) {
            Integer primeNumber = Engine.getRandomNumber();
            for (int k = 0; k < questionAndAnswer[i].length; k++) {
                questionAndAnswer[i][k] = String.valueOf(primeNumber);
                questionAndAnswer[i][COUNTER] = (isProbablePrime(primeNumber)) ? "yes" : "no";
            }
        }
        Engine.greet(DESCRIPTION, questionAndAnswer);
    }
    //почему то падает на цифре 15 тест, но у меня в консоли не падает

    private static boolean isProbablePrime(Integer primeNumber) {
        BigInteger bigInteger = BigInteger.valueOf(primeNumber);
        return bigInteger.isProbablePrime((int) Math.log(primeNumber));
    }
}
