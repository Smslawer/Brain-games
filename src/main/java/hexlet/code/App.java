package hexlet.code;

import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GamePrime;
import hexlet.code.games.GameProgression;


import java.util.Scanner;

public class App {
    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

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

        int number = numberOfGame.nextInt();
        System.out.println("Your choice: " + number);
        switch (number) {
            case EXIT -> {
                System.out.println("Your choice: " + number + "." + " Good luck!");
                return;
            }
            case GREET -> {
                Cli.greet();
            }
            case EVEN -> {
                GameEven.runGame();
            }
            case CALC -> {
                GameCalc.runGame();
            }
            case GCD -> {
                GameGCD.runGame();
            }
            case PROGRESSION -> {
                GameProgression.runGame();
            }
            case PRIME -> {
                GamePrime.runGame();
            }
            default -> System.out.println("Unexpected value: " + number + ". "
                    + "You didn't enter a game number. Restart the program and try again.");
        }
        numberOfGame.close();
    }


}
