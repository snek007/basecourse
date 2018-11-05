package week2;

import base.TaskUtils;
import week2.utils.ArrUtils;

/**
 * 9. Перевести положительное число с десятичной системы счисления в двоичную.
 * И вывести на экран в виде строки
 * <p>
 * 8 -> 1000
 * 15 -> 1111
 */
public class Task9 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        int[] masCode = new int[9];

        for (int i = masCode.length - 1; number > 0; i--) {
            masCode[i] = number % 2;
            number = number / 2;

        }
        ArrUtils.siplePrintArr(masCode);

    }
}

