package week1;

/**
 * 10. Дано трехзначное число. Определить:
 * а) верно ли, что все его цифры одинаковые;
 * б) есть ли среди его цифр одинаковые.
 *
 * Взависимости от результата сделать вывод "Все цифры одинаковые" / "Некоторые цифры одинаковые" / "Нету одинаковых цифр"
 */
public class Task10 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int num3 = number % 10;
        int last2 = number / 10;

        int num2 = last2 % 10;

        int num1 = last2 / 10;

        if (num1 == num2 && num2 == num3) {
            System.out.println("Все цифры одинаковые");
        } else if (num1 == num2 || num2 == num3 || num3 == num1) {
            System.out.println("Некоторые цифры одинаковые");
        } else {
            System.out.println("Нету одинаковых цифр");
        }
    }
}
