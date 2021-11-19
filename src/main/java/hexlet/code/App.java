package hexlet.code;

import hexlet.code.games.GameEven;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;


import java.util.Scanner;

public class App {
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
            if (number == 0) {
                System.out.println("Your choice: " + number + "." + " Good luck!");
                return;
            } else if (number == 1) {
                System.out.println("Your choice: " + number);
                Cli.greet();
            } else if (number == 2) {
                System.out.println("Your choice: " + number);
                GameEven.even();
            } else if (number == NUMBER_OF_GAME_3) {
                System.out.println("Your choice: " + number);
                Calc.calculate();
            } else if (number == NUMBER_OF_GAME_4) {
                System.out.println("Your choice: " + number);
                GCD.divisor();
            } else if (number == NUMBER_OF_GAME_5) {
                System.out.println("Your choice: " + number);
                Progression.progress();
            } else if (number == NUMBER_OF_GAME_6) {
                System.out.println("Your choice: " + number);
                Prime.isPrime();
            }
        } else {
            System.out.println("Вы не ввели номер игры. Перезапустите программу и попробуйте снова.");
        }
        numberOfGame.close();
    }


}
