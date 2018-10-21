package week1;

/**
 * 5. Известны две скорости, одна в километрах в час, другая в метрах в секунду.
 * Какая из них больше? (нужно вывести на консоль наибольшее)
 */
public class Task5 {
    public static void main(String[] args) {
        int metersPerSecond = Integer.parseInt(args[0]);
        int kilometersPerHour = Integer.parseInt(args[1]);

        int metersPerSecond2 = kilometersPerHour * 1000 / 3600 ;

        if ( metersPerSecond > metersPerSecond2 ) {
            System.out.println(metersPerSecond);
        } else {
            System.out.println(kilometersPerHour);
        }

    }
}
