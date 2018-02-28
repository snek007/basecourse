package week2;

import base.TaskUtils;

import java.util.Arrays;

/**
 * 7. Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
 * который получается в результате суммы arr1[i] + arr2[i]
 *
 * Длина массивов будет больше чем 0.
 *
 * {4, 19, 25, 2} {-7, 9, 6, 17} -> {-3, 28, 31, 19}
 * {7, 2, 15} {12, 14, 18} -> {19, 16, 33}
 */
public class Task7 {
    public static void main(String[] args) {

        int[] arr1 = TaskUtils.arrayConverter(Arrays.copyOfRange(args,0,  args.length / 2));
        int[] arr2 = TaskUtils.arrayConverter(Arrays.copyOfRange(args, args.length / 2,  args.length));

        //        Yours code...

    }
}
