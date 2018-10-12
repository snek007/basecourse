package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task1.main(new String[]{"13"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Я на работе"));
    }

    @Test
    public void main2() throws Exception {

        Task1.main(new String[]{"7"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Я отдыхаю"));
    }


    @Test
    public void mainNeg() throws Exception {

        Task1.main(new String[]{"-5"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Неверное число"));
    }

}