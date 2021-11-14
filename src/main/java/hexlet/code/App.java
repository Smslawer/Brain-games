package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner numberOfGame = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" + "1 - Greet\n" + "2 - Even\n"
                + "0 - Exit");

        if (numberOfGame.hasNextInt()) {
            int number =  numberOfGame.nextInt();
            if (number == 0) {
                System.out.println("Your choice: " + number + "." + " Good luck!");
            } else if (number == 1) {
                System.out.println("Your choice: " + number);
                Cli.greet();
            } else if (number == 2) {
                System.out.println("Your choice: " + number);
                GameEven.even();
            }
        } else {
            System.out.println("Вы не ввели номер игры. Перезапустите программу и попробуйте снова.");
        }
        numberOfGame.close();
    }
}
