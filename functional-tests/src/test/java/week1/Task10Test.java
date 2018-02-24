package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task10Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task10.main(new String[]{"333"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Все цифры одинаковые"));
    }

    @Test
    public void main2() throws Exception {

        Task10.main(new String[]{"133"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Некоторые цифры одинаковые"));
    }

    @Test
    public void main3() throws Exception {

        Task10.main(new String[]{"123"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Нету одинаковых цифр"));
    }


}