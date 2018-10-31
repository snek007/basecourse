package week2;

/**
 * 1. Создать массив челых чисел от 1 до 10 и вывести его на экран в виде сообщения "{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}"
 */
public class Task1 {
    public static void main(String[] args) {

        int[] mas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("{");
        for (int i = 0; i < mas.length - 1; i++) {

            System.out.print(mas[i] + ", ");

        }
        System.out.print(mas[9]);
        System.out.print("}");
    }
}
