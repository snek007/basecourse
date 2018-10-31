package week2;

/**
 * 1. Создать массив челых чисел от 1 до 10 и вывести его на экран в виде сообщения "{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}"
 */
import week2.utils.ArrUtils;
public class Task1 {
    public static void main(String[] args) {

        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrUtils.printArr(mas); // show "mas" like "{x1, x2, x3....xn}"
        /*System.out.print("{");
        for (int i = 0; i < mas.length - 1; i++) {

            System.out.print(mas[i] + ", ");

        }
        System.out.print(mas[mas.length - 1]);
        System.out.print("}");*/
    }
}
