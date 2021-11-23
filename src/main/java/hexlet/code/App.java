package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.GameEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;


import java.util.Scanner;

public class App {
    private static final int EXIT = 0;
    private static final int GREET_1 = 1;
    private static final int NUMBER_OF_GAME_2 = 2;
    private static final int NUMBER_OF_GAME_3 = 3;
    private static final int NUMBER_OF_GAME_4 = 4;
    private static final int NUMBER_OF_GAME_5 = 5;
    private static final int NUMBER_OF_GAME_6 = 6;

    public static void main(String[] args) {
        Scanner numberOfGame = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        if (numberOfGame.hasNextInt()) {
            int number = numberOfGame.nextInt();
            switch (number) {
                case EXIT -> {
                    System.out.println("Your choice: " + number + "." + " Good luck!");
                    return;
                }
                case GREET_1 -> {
                    System.out.println("Your choice: " + number);
                    Cli.greet();
                }
                case NUMBER_OF_GAME_2 -> {
                    System.out.println("Your choice: " + number);
                    GameEven.even();
                }
                case NUMBER_OF_GAME_3 -> {
                    System.out.println("Your choice: " + number);
                    Calc.calculate();
                }
                case NUMBER_OF_GAME_4 -> {
                    System.out.println("Your choice: " + number);
                    GCD.divisor();
                }
                case NUMBER_OF_GAME_5 -> {
                    System.out.println("Your choice: " + number);
                    Progression.progress();
                }
                case NUMBER_OF_GAME_6 -> {
                    System.out.println("Your choice: " + number);
                    Prime.isPrime();
                }
                default -> System.out.println("Unexpected value: " + number);
            }
        } else {
            System.out.println("Вы не ввели номер игры. Перезапустите программу и попробуйте снова.");
        }
        numberOfGame.close();
    }


}
