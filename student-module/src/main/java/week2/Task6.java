package week2;

import base.TaskUtils;
import week2.utils.ArrUtils;

import java.util.Arrays;

/**
 * 6. Вывести в консоль элементы той половины массива у которой среднее арифметическое максимальное.
 * Если длина массива - непарное число, то средний элемент не принимать в расчет.
 * Если среднее арифметическое половинок массива одинаковая, то вывести в консоль весь массив.
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 * <p>
 * {4, 19, 28, 25, 2, 9, 6, 17} -> {4, 19, 28, 25}
 * {7, 2, 15, 99, 12, 14, 18} -> {12, 14, 18}
 * {7, 2, 15, 99, 3, 14, 7} -> {7, 2, 15, 99, 3, 14, 7}
 */
public class Task6 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(args);

        String resArr = ArrUtils.ifMasEmptyPrint_2(array);
        if (resArr != null) {
            System.out.println(resArr);
            return;
        }
        int step = array.length % 2 == 0 ? 0 : 1;
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sumFirstPart = sumFirstPart + array[i];
        }
        for (int i = array.length / 2 + step; i < array.length; i++) {
            sumSecondPart = sumSecondPart + array[i];
        }

        int firstArifmMean = sumFirstPart / (array.length / 2);
        int secondArifmMean = sumSecondPart / (array.length / 2 + step);
        if (firstArifmMean > secondArifmMean) {
//            ArrUtils.printPartOfMas(array, 0, array.length / 2);
            System.out.println(ArrUtils.arrToStr(array, 0, array.length / 2));
        } else if (firstArifmMean < secondArifmMean) {
//            ArrUtils.printPartOfMas(array, array.length / 2 + step, array.length);
            System.out.println(ArrUtils.arrToStr(array, array.length / 2 + step, array.length));
        } else {
            ArrUtils.printArr(array);
        }
    }
}
