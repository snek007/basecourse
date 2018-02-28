package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task12Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task12.main(new String[]{"24081992"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("1"));
    }

    @Test
    public void main2() throws Exception {

        Task12.main(new String[]{"808"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("2"));
    }

    @Test
    public void main3() throws Exception {

        Task12.main(new String[]{"8"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("1"));
    }

    @Test
    public void main4() throws Exception {

        Task12.main(new String[]{"0"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("0"));
    }

}