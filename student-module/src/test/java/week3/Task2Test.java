package week3;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task2Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() {

        Task2.main(new String[]{"Он настоящая бяка"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Он настоящая \"вырезано цензурой\""));
    }

    @Test
    public void mainEmptyTest() {

        Task2.main(new String[]{""});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString(""));
    }
}
