package week2;

import base.TaskUtils;

/**
 * 10. Перевести положительно число с двоичной системы счисления в десятичную.
 * Число будет переданно в виде массива (int[] number).
 * И вывести на экран.
 * <p>
 * 1000 -> 8
 * 1111 -> 15
 */
public class Task10 {
    public static void main(String[] args) {

        int[] number = TaskUtils.arrayConverter(args);
        int  res = 0;

        for (int i = 0; i < number.length; i++) {
            res +=  (number[i] * Math.pow(2, number.length - i - 1));

        }
        System.out.println(res);
    }
}
