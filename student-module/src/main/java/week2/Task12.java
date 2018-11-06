package week2;

/**
 * 12. Посчитать сколько раз встречается символ 8 в заданном числе (размер числа - нефиксированый, но >= 0)
 * 5678  -   1
 * 5889  -   2
 * 8888  -   4
 * 989990  - 1
 */
public class Task12 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        int res = 0;
        int[] masNum = new int[10];

        for (int i = 0; number != 0; i++) {
            masNum[i] = number % 10;
            number = number / 10;
        }
        for (int i = 0; i < masNum.length; i++) {
            if (masNum[i] == 8) {
                res++;
            }
        }
        System.out.println(res);
    }
}
