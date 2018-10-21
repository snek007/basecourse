package week1;

/**
 * 12. Определить, является ли шестизначное число "счастливым" (сумма первых трех цифр равна сумме последних трех цифр).
 * Ответ вывести в виде сообщения true/false.
 */
public class Task12 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int num6 = number % 10;
        int first5 = number / 10;

        int num5 = first5 % 10;
        int first4 = first5 / 10;

        int num4 = first4 % 10;
        int first3 = first4 / 10;

        int num3 = first3 % 10;
        int first2 = first3 / 10;

        int num2 = first2 % 10;
        int num1 = first2 / 10;

        /*int[] mas = new int[6];
        int count = 0;
        while(number != 0){
            int last = number % 10;
            mas[count] = last;
            count++;
            number = number / 10;
        }

        System.out.println(mas[0] + mas[1] + mas[2] == mas[3] + mas[4] + mas[5]);*/


        System.out.println(num1 + num2 + num3 == num4 + num5 + num6 );
    }
}
