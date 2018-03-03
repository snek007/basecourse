package methods;

public class ArrayUtils {


    /**
     * Генерирует массив чисел от 1 до n, в зависимость от того,
     * какой size был передан в качестве аргумента.
     *
     * @param size размер массива, который нужно сгенерировать
     *
     * @return массив чисел от 1 до size, включительно
     *          или null, если size < 0
     *          или пустой массив, если size == 0
     *
     */
    public static int[] generateArray(int size){
        return null;
    }

    /**
     * Возвращает минимальное число в переданом массиве.
     *
     * @param array массив для поиска минимального числа
     *
     * @return минимальное число в массиве
     *          или -1 + вывести сообщение ("NullPointerException"), если массив == null
     *          или -1 + вывести сообщение ("EmptyArrayException"), если длина массива == 0
     *
     */
    public static int findMin(int[] array){
        return 0;
    }

    /**
     * Возвращает максимальное число в переданом массиве.
     *
     * @param array массив для поиска максимального числа
     *
     * @return максимальное число в массиве
     *          или -1 + вывести сообщение ("NullPointerException"), если массив == null
     *          или -1 + вывести сообщение ("EmptyArrayException"), если длина массива == 0
     *
     */
    public static int findMax(int[] array){
        return 0;
    }

    /**
     * Генерирует массив размером size, случайных чисел от min до max (не включительно), в зависимость от того,
     * какие аргументы были переданы.
     *
     * @param size размер массива, который нужно сгенерировать
     *
     * @param min минимальное случайно сгенерированое число, которое может присутсвовать в массиве
     *
     * @param max максимальное случайно сгенерированое число, предыдущее от которого может присутсвовать в массиве
     *
     * @return массив случайных чисел от min до max, не включительно
     *          или null, если size < 0, min >= max
     *          или пустой массив, если size == 0
     *
     */
    public static int[] generateRandomArray(int size, int min, int max){
        return null;
    }

    /**
     * Генерирует массив размером size, случайных чисел от min до max (не включительно), в зависимость от того,
     * какие аргументы были переданы. На четных индексах (и нулевом индексе) массива должны быть парные числа,\
     * на нечетных - непарные.
     *
     * @param size размер массива, который нужно сгенерировать
     *
     * @param min минимальное случайно сгенерированое число, которое может присутсвовать в массиве
     *
     * @param max максимальное случайно сгенерированое число, предыдущее от которого может присутсвовать в массиве
     *
     * @return массив случайных чисел от min до max, не включительно
     *          или null, если size < 0, min >= max
     *          или пустой массив, если size == 0
     *
     */
    public static int[] generateRandomEvenOddArray(int size, int min, int max){
        return null;
    }

    /**
     * Возвращает строчное (String) редставление переданного массива.
     * Например в виде {1, 2, 3, 4, 5}.
     *
     * @param array массив целых чисел для перевода в String
     *
     * @return строчное (String) редставление переданного массива,
     *          если массив == null, тода вернуть "null",
     *          если длина массива == 0, тогда вернуть "{}"
     *
     * @see String
     *
     */
    public static String arrayToString(int[] array){
        return "{}";
    }

    /**
     * Возвращает строчное (String) редставление переданного массива.
     * Например в виде {A, b, C, d, e}.
     *
     * @param array массив символов для перевода в String
     *
     * @return строчное (String) редставление переданного массива,
     *          если массив == null, тода вернуть "null",
     *          если длина массива == 0, тогда вернуть "{}"
     *
     * @see String
     *
     */
    public static String arrayToString(char[] array){
        return "{}";
    }

    /**
     * Возвращает строчное (String) редставление переданного массива.
     * Например в виде {Apple, Monkey, weather, home, Love}.
     *
     * @param array массив строк для перевода в String
     *
     * @return строчное (String) редставление переданного массива,
     *          если массив == null, тода вернуть "null",
     *          если длина массива == 0, тогда вернуть "{}"
     *
     * @see String
     *
     */
    public static String arrayToString(String[] array){
        return "{}";
    }

    /**
     * Copies the specified array, truncating or padding with zeros (if necessary)
     * so the copy has the specified length.  For all indices that are
     * valid in both the original array and the copy, the two arrays will
     * contain identical values.  For any indices that are valid in the
     * copy but not the original, the copy will contain 0.
     * Such indices will exist if and only if the specified length
     * is greater than that of the original array.
     *
     * @param original the array to be copied
     *
     * @param newLength the length of the copy to be returned
     *
     * @return a copy of the original array, truncated or padded with zeros
     *     to obtain the specified length or null if newLength> is negative
     *     or/and if original is null
     *
     * @since 1.8
     */
    public static int[] copyOf(int[]  original, int newLength) {
        return null;
    }

    /**
     * Copies the specified range of the specified array into a new array.
     * The initial index of the range (from) must lie between zero
     * and original.length, inclusive.  The value at
     * original[from] is placed into the initial element of the copy
     * (unless from == original.length or from == to).
     * Values from subsequent elements in the original array are placed into
     * subsequent elements in the copy.  The final index of the range
     * (to), which must be greater than or equal to from,
     * may be greater than original.length, in which case
     * 0 is placed in all elements of the copy whose index is
     * greater than or equal to original.length - from.  The length
     * of the returned array will be to - from.
     *
     * @param original the array from which a range is to be copied
     *
     * @param from the initial index of the range to be copied, inclusive
     *
     * @param to the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     *
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length.
     *     null if {@code from < 0} or {@code from > original.length}
     *     or/and if from > to
     *     or/and  if original is null
     *
     * @since 1.8
     */
    public static int[] copyOfRange(int[]  original, int from, int to) {
        return null;
    }

    /**
     * Sorts the specified array into ascending numerical order.
     *
     * Implementation note: The sorting algorithm is a Bubble Sort.
     * This algorithm offers O(n^2) performance.
     *
     * @param array the array to be sorted
     */
    public static void bubbleSort(int[] array){

    }

    /**
     * Sorts the specified array into ascending numerical order.
     *
     * Implementation note: The sorting algorithm is a Select Sort.
     * This algorithm offers O(n^2) performance.
     *
     * @param array the array to be sorted
     */
    public static void selectSort(int[] array){

    }

    /**
     * Sorts the specified array into ascending numerical order.
     *
     * Implementation note: The sorting algorithm is a Insert Sort.
     * This algorithm offers O(n^2) performance.
     *
     * @param array the array to be sorted
     */
    public static void insertSort(int[] array){

    }

}
