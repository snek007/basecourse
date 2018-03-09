package week3;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task4Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() {

        Task4.main(new String[]{"Как решить это задание и не сломать себе голову?"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("каК ршт отэ здне и н ьтамолс сб ?уволог"));
    }

    @Test
    public void mainEmptyTest() {

        Task4.main(new String[]{""});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString(""));
    }
}
