package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task13Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() throws Exception {

        Task13.main(new String[]{"0"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("0"));
    }

    @Test
    public void main2Test() throws Exception {

        Task13.main(new String[]{"2"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("1"));
    }

    @Test
    public void main3Test() throws Exception {

        Task13.main(new String[]{"7"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("13"));
    }
}
