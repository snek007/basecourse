package week2;

import base.TaskUtils;
import week2.utils.ArrUtils;

/**
 * 8. Посчитать сколько раз число 5 встречается в массиве. Результат вывести на экран (только число).
 *
 * {4, 19, 25, 5, 7, 9, 5, 17} -> 2
 * {7, 2, 15} -> 0
 *
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 */
public class Task8 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(args);

        String resArr = ArrUtils.ifMasEmptyPrint_2(array);
        if (resArr != null) {
            System.out.println(resArr);
            return;
        }
        int num = 5;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                sum++;
            }else {
                sum = sum;
            }
        }
        System.out.println(sum);
    }
}
