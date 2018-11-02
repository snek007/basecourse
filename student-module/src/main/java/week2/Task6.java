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

        double firstArifmMean = sumFirstPart / (array.length / 2);
        double secondArifmMean = sumSecondPart / (array.length / 2 + step);
        if (firstArifmMean > secondArifmMean) {
            System.out.print("{");
            for (int i = 0; i < array.length / 2 - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length / 2 - 1]);
            System.out.print("}");
        } else if (firstArifmMean < secondArifmMean) {
            System.out.print("{");
            for (int i = array.length / 2 + step; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1]);
            System.out.print("}");
        } else {
            ArrUtils.printArr(array);
        }
    }
}
