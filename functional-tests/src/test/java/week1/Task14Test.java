package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task14Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task14.main(new String[]{"124", "4"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("true"));
    }

    @Test
    public void main2() throws Exception {

        Task14.main(new String[]{"1456", "567"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("false"));
    }

    @Test
    public void main3() throws Exception {

        Task14.main(new String[]{"1", "2"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("false"));
    }

    @Test
    public void main4() throws Exception {

        Task14.main(new String[]{"18", "98"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("true"));
    }
}