package week1;

/**
 * 15. Посчитать сколько раз встречается символ 5 в заданном числе (число трехкратное)
 *      435  -   1
 *      505  -   2
 *      555  -   3
 *      305  -   1
 */
public class Task15 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int num3 = number % 10;
        int last2 = number / 10;

        int num2 = last2 % 10;

        int num1 = last2 / 10;

        int sum = 0;

        if (num1 == 5) {
            sum = sum + 1;
        }
        if (num2 == 5) {
            sum = sum + 1;
        }
        if (num3 == 5) {
            sum = sum + 1;
        }
        System.out.println(sum);
//        if (num1 == 5 || num2 == 5 || num3 == 5) {
//            System.out.println(sum + 1);
//        } else if (num1 == 5 && num2 == 5 && num3 == 5) {
//            System.out.println(sum + 2);
//        } else {
//            System.out.println(sum + 3);
//        }

    }
}
