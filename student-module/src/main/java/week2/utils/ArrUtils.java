package week2.utils;

public class ArrUtils {
    // show "mas" like "{x1, x2, x3....xn}"
    public static void printArr (int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length - 1; i++) {

            System.out.print(arr[i] + ", ");

        }
        System.out.print(arr[arr.length - 1]);
        System.out.print("}");
    }
}
