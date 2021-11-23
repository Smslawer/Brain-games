package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public class Prime {
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    static final int COUNTER = 1;

    public static void isPrime() {
        String[][] questionAndAnswer = new String[Engine.getNumberOfTrueTries()][2];
        for (int i = 0; i < Engine.getNumberOfTrueTries(); i++) {
            Integer primeNumber = (Integer) Engine.getFirstNumber();
            BigInteger bigInteger = BigInteger.valueOf(primeNumber);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(primeNumber));
            for (int k = 0; k < questionAndAnswer[i].length; k++) {
                questionAndAnswer[i][k] = String.valueOf(primeNumber);
                questionAndAnswer[i][COUNTER] = (probablePrime) ? "yes" : "no";
            }
        }
        Engine.greet(DESCRIPTION, questionAndAnswer);

//        Engine.greet();

//        if (Engine.getUsersName().equals("")) {
//            return;
//        }
//        Scanner trueAnswer = new Scanner(System.in);
//
//        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'");
//        while (counter < Engine.getNumberOfTrueTries()) {
//            Integer primeNumber = (Integer) Engine.getFirstNumber();
//            System.out.println("Question: " + primeNumber);
//            if (trueAnswer.hasNextInt()) {
//                System.out.println("Answer must be 'yes' or 'no'! Let's tru again, " + Engine.getUsersName());
//                return;
//            } else {
//                usersAnswer = trueAnswer.nextLine();
//                System.out.println("Your answer: " + usersAnswer);
//            }
//
//            BigInteger bigInteger = BigInteger.valueOf(primeNumber);
//            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(primeNumber));
//
//            if (probablePrime) {
//                correctAnswer = "yes";
//            } else {
//                correctAnswer = "no";
//            }
//            if (correctAnswer.equals(usersAnswer)) {
//                System.out.println("Correct!");
//                counter++;
//            } else {
//                System.out.println("'" + usersAnswer + "'" + " is wrong answer. Correct answer was "
//                        + "'" + correctAnswer + "'" + ". Let's try again, " + Engine.getUsersName() + "!");
//                counter = 0;
//            }
//        }
//        System.out.println("Congratulations, " + Engine.getUsersName() + "!");
//        counter = 0;
//        correctAnswer = "";

    }

}
