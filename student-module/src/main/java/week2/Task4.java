package week2;

import base.TaskUtils;
import week2.utils.ArrUtils;

/**
 * 4. Найти минимальное и максимальное значения в массиве и вывести их на консоль.
 * Например "Min = 4, max = 46".
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 */
public class Task4 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(args);

        String resArr = ArrUtils.ifMasEmptyPrint_2(array);
        if (resArr != null) {
            System.out.println(resArr);
            return;
        }
        /*if (array == null) {
            System.out.println("null");
        } else if (array.length == 0) {
            System.out.println("{}");
        } else {*/
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            min = min < array[i] ? min : array[i];
            max = max > array[i] ? max : array[i];
        }

        System.out.print("Min = " + min);
        System.out.print(", ");
        System.out.print("max = " + max);
//        }

    }
}
