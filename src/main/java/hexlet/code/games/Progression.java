package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progress() {
        int counter = 0;
        int correctAnswer = 0;
        int usersAnswer = 0;
        int firstNumber = Engine.getFirstNumber();
        int num = Engine.getSecondNumber();
        int it = 0;
        String question = "";

        Engine.greet();

        if (Engine.getUsersName().equals("")) {
            return;
        }

        Scanner trueAnswer = new Scanner(System.in);

        System.out.println("What number is missing in the progression?");
        while (counter < Engine.getNumberOfTrueTries()) {
            int[] sum = new int[firstNumber + 1];
            for (int i = 0; i <= firstNumber; i++) {
                num += 2;
                sum[i] = num;
            }
            Random random = new Random();
            it = random.nextInt(sum.length);
            for (int i = 0; i < sum.length; i++) {
                if (sum[i] == sum[it]) {
                    correctAnswer = sum[i];

                    int[] firstTmp = new int[i];
                    System.arraycopy(sum, 0, firstTmp, 0, i);
                    String firstArray = Arrays.toString(firstTmp);
                    firstArray = firstArray.substring(1, firstArray.length() - 1);

                    int[] secondTmp = new int[sum.length - (i + 1)];
                    System.arraycopy(sum, i + 1, secondTmp, 0, sum.length - (i + 1));
                    String secondArray = Arrays.toString(secondTmp);
                    secondArray = secondArray.substring(1, secondArray.length() - 1);
                    question = firstArray + " . . " + secondArray;
                }
            }
            System.out.println(question);
            if (trueAnswer.hasNextInt()) {
                usersAnswer = trueAnswer.nextInt();
                System.out.println("Your answer: " + usersAnswer);
            } else {
                System.out.println("Ответ должен быть числом! Перезапустите программу и попробуйте снова");
                return;
            }
            if (correctAnswer == usersAnswer) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.println("'" + usersAnswer + "'" + " is wrong answer. Correct answer was "
                        + "'" + correctAnswer + "'" + ". Let's try again, " + Engine.getUsersName() + "!");
                counter = 0;
            }
        }
        System.out.println("Congratulations, " + Engine.getUsersName() + "!");
        counter = 0;
    }

}
