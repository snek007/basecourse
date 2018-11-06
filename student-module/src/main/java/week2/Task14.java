package week2;

/**
 * 14. Проверить или является число простым.
 * Результат вывести в виде сообщения true/false.
 */
public class Task14 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        int val = 0;

        if (number <= 1) {
            System.out.println("false");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    val++;
                }
            }
            System.out.println(val == 0);
        }
    }
}

