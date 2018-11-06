package week2;

/**
 * 13. Последовательность Фибоначчи определяется так:
 * <p>
 * φ0=0,  φ1=1, ..., φn=φn-1+φn-2.
 * <p>
 * По данному числу n определите n-е число Фибоначчи φn и вывести его на экран.
 * Число будет >= 0.
 * <p>
 * φ7 -> 13
 * φ10 -> 55
 */
public class Task13 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        if (number == 0) {
            System.out.println("0");
        } else {
            int[] masFibNum = new int[number + 1];
            masFibNum[0] = 0;
            masFibNum[1] = 1;
            for (int i = 2; i < masFibNum.length; i++) {
                masFibNum[i] = masFibNum[i - 1] + masFibNum[i - 2];
            }
            System.out.println(masFibNum[number]);
        }
    }
}
