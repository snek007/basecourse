package base;

public class TaskUtils {

    public static int[] arrayConverter(String[] args) {
        if (args == null) return null;
        if (args.length == 0) return new int[0];

        int[] array = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            if (args[i] == null || args[i].isEmpty()) {
                array[i] = 0;
            } else {
                try {
                    array[i] = Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                    array[i] = 0;
                }
            }
        }
        return array;
    }

}
