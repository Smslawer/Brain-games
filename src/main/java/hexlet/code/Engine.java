package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static final int NUMBER_OF_TRIES = 3;
    private static final int COUNT_OF_NUMBER = 20;
    private static String currentName = "";

    public static void greet() {
        Scanner usersName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        if (!usersName.hasNextInt()) {
            currentName =  usersName.nextLine();
            System.out.println("Hello, " + currentName + "!");
        } else {
            System.out.println("Извините, имя не может быть числом или знаком! "
                    + "Перезапустите программу и попробуйте снова");
        }

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

    public static String getOperator() {
        Random random = new Random();
        String[] operators = {"+", "-", "*"};
        int i = random.nextInt(NUMBER_OF_TRIES);
        return operators[i];
    }

    public static int getFirstNumber() {
        int firstNumber = (int) (2 + Math.random() * COUNT_OF_NUMBER);
        return firstNumber;
    }

    public static int getSecondNumber() {
        int secondNumber = (int) (2 + Math.random() * COUNT_OF_NUMBER);
        return secondNumber;
    }



}
