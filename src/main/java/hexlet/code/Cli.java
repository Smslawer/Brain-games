package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        Scanner usersName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\n" + "May I have your name?");
        if (!usersName.hasNextInt()) {
            String user =  usersName.nextLine();
            System.out.println("Hello, " + user + "!");
        } else {
            System.out.println("Извините, имя не может быть числом или знаком! "
                     + "Перезапустите программу и попробуйте снова");
        }

        usersName.close();
    }

}
