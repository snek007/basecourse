package week2;

import base.TaskUtils;

import java.util.Arrays;

import week2.utils.ArrUtils;

/**
 * Сдвинуть массив на заданное количество позиций.
 * Длина массива > 0
 * <p>
 * {1,2,3,4,5} -> 2 = {4,5,1,2,3};
 * {1,2,3,4,5} -> 3 = {3,4,5,1,2}
 */
public class Task15 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(Arrays.copyOfRange(args, 1, args.length));
        int position = Integer.parseInt(args[0]);

        int[] resArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int ind = i + position;
            if (ind < array.length) {
                resArr[ind] = array[i];
            } else {
                resArr[ind - array.length] = array[i];
            }
        }
        ArrUtils.printArr(resArr);

   }
}
