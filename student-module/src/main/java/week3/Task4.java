package week3;

/**
 * 3. Из данного предложения, каждое четное слово инвертировать (0, 2, 4, ...), в каждом нечетном слове удалить каждую четную букву (0, 2, 4, ...).
 * Результат выводить на консоль.
 *
 * В качестве разделителя слов использовать пробел
 *
 * Ввод:
 * Как решить это задание и не сломать себе голову?
 *
 * Вывод:
 * каК ршт отэ здне и н ьтамолс сб ?уволог
 */
public class Task4 {
    public static void main(String[] args) {

        String text = args[0];

        //        Yours code...

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(i % 2 == 0) {
//                каждое четное слово инвертировать
                words[i] = invertWord(words[i]);
            } else {
//                в каждом нечетном слове удалить каждую четную букву
                    words[i] = deleteEvenLetter(words[i]);
            }
        }

//        массив слов преобразовать в строку

        String result = arrayToString(words);

        System.out.println(result);

    }

    private static String deleteEvenLetter(String word) {

        char[] letters = word.toCharArray();

        String result = "";

        for (int i = 0; i < letters.length; i++) {
            if(i % 2 == 1) {
                result = result + letters[i];
            }
        }

        return result;
    }

    private static String invertWord(String word) {

        char[] letters = word.toCharArray();

        String result = "";

        for (int i = letters.length - 1; i >= 0; i--) {
            result = result + letters[i];
        }

        return result;
    }

    private static String arrayToString(String[] words) {

        String result = "";

        for (int i = 0; i < words.length; i++) {
            result = result + words[i] + " ";
        }
        return result;
    }
}
