package week2;

import base.TaskUtils;
import week2.utils.ArrUtils;

/**
 * 5. Поменять местами наибольший и наименьший элементы в массиве и вывести его на экран в виде сообщения.
 * Если наименьший и наибольший элементы присутствуют в нескольких экземлярах, то поменять местами только те,
 * которые обладают наименьшим индексом в массиве.
 * Например "{1, 2, 1, 4, 5, 10, 7, 8, 9, 10}" -> "{10, 2, 1, 4, 5, 1, 7, 8, 9, 10}".
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 */
public class Task5 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(args);

        String resArr = ArrUtils.ifMasEmptyPrint_2(array);
        if (resArr != null) {
            System.out.println(resArr);
            return;
        }
        int maxI = ArrUtils.indexOfMaxNum(array);
        int minI = ArrUtils.indexOfMinNum(array);

        ArrUtils.swapElements(array, maxI, minI);


        ArrUtils.printArr(array);
    }


}

