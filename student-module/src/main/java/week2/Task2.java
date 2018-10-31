package week2;

/**
 * 2. Создать массив целых парных чисел от 20 до 2 и вывести его на экран в виде сообщения "{20, 18, 16, 14, 12, 10, 8, 6, 4, 2}"
 */
import week2.utils.ArrUtils;
public class Task2 {
    public static void main(String[] args) {

        int highPoint = 20;


        int[] mas = new int[10];
        for (int i = 0; i < mas.length ; i++) {
            mas [i] = highPoint;
            highPoint -=2;

        }
        ArrUtils.printArr(mas); // show "mas" like "{x1, x2, x3....xn}"
        /*System.out.print("{");
        for (int i = 0; i < mas.length - 1; i++) {

            System.out.print(mas[i] + ", ");

        }
        System.out.print(mas [mas.length - 1]);
        System.out.print("}");*/




    }
}
