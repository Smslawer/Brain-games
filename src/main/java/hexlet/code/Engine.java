package hexlet.code;

//import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static final int NUMBER_OF_TRIES = 3;
    private static final int COUNT_OF_NUMBER = 20;
    private static String currentName = "";

    public static void greet(String description, String[][] questionAndAnswer) {
        Scanner forGame = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        if (forGame.hasNextInt()) {
            System.out.println("Извините, имя не может быть числом или знаком! "
                    + "Перезапустите программу и попробуйте снова");
            return;
        }
        currentName = forGame.nextLine();
        System.out.println("Hello, " + currentName + "!");
        System.out.println(description);
        for (int i = 0; i < NUMBER_OF_TRIES; i++) {
            System.out.println("Question: " + questionAndAnswer[i][0]);
            String usersAnswer = forGame.nextLine();
            System.out.println("Your answer: " + usersAnswer);
            if (usersAnswer.equals(questionAndAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + usersAnswer + "'" + " is wrong answer. Correct answer was "
                        + "'" + questionAndAnswer[i][1] + "'" + ". Let's try again, " + currentName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + getUsersName() + "!");
    }

    public static int getNumberOfTrueTries() {
        return NUMBER_OF_TRIES;
    }

    public static String getUsersName() {
        return currentName;
    }

    public static int getCountOfNumbers() {
        return COUNT_OF_NUMBER;
    }

    public static int getRandomNumber() {
        return (int) (2 + Math.random() * COUNT_OF_NUMBER);
    }
}
