package hexlet.code;

public class Utils {
    public static int getRandomNumber(int countOfNumber) {
        return (int) (2 + Math.random() * countOfNumber);
    }
}
