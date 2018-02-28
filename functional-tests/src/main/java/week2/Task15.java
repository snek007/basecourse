package week2;

import base.TaskUtils;

import java.util.Arrays;

/**
 * Сдвинуть массив на заданное количество позиций.
 * Длина массива > 0
 *
 *      {1,2,3,4,5} -> 2 = {4,5,1,2,3};
 *      {1,2,3,4,5} -> 3 = {3,4,5,1,2}
 */
public class Task15 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(Arrays.copyOfRange(args, 1, args.length));
        int position = Integer.parseInt(args[0]);

        //        Yours code...

    }
}
