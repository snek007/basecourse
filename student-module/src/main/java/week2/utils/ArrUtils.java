package week2.utils;

public class ArrUtils {
    // show "mas" like "{x1, x2, x3....xn}"
    public static void printArr(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length - 1; i++) {

            System.out.print(arr[i] + ", ");

        }
        System.out.print(arr[arr.length - 1]);
        System.out.print("}");
//        System.out.println(arrToStr(arr, 0 , arr.length));
    }

    // show "mas" like "x1x2x3....xn"
    public static void siplePrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }

    public static boolean ifMasEmptyPrint(int[] arr) {
        if (arr == null) {
            System.out.println("null");
            return true;
        } else if (arr.length == 0) {
            System.out.println("{}");
            return true;
        }
        return false;
    }

    public static String ifMasEmptyPrint_2(int[] arr) {
        if (arr == null) {
            return "null";
        } else if (arr.length == 0) {
            return "{}";
        }
        return null;
    }

    public static int indexOfMinNum(int[] arr) {
        int minI = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[minI] > arr[i]) {
                minI = i;
            }
        }
        return minI;
    }

    public static int indexOfMaxNum(int[] arr) {
        int maxI = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[maxI] < arr[i]) {
                maxI = i;
            }
        }
        return maxI;
    }

    public static void swapElements(int[] array, int maxI, int minI) {
        int temp = array[minI];
        array[minI] = array[maxI];
        array[maxI] = temp;
    }

    //show array in Terminal with start and end of arr[i]
    public static void printPartOfMas(int[] arr, int startMas, int endMas) {
        System.out.print("{");
        for (int i = startMas; i < endMas - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[endMas - 1]);
        System.out.print("}");

    }

    //return value of array with left/right rounds of arr[i]
    public static String arrToStr(int[] arr, int left, int right) {
        String res = "{";
        for (int i = left; i < right - 1; i++) {
            res += arr[i] + ", ";
        }
        res += arr[right - 1] + "}";

        return res;
    }
}
