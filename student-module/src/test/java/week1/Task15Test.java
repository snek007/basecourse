package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task15Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task15.main(new String[]{"435"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("1"));
    }

    @Test
    public void main2() throws Exception {

        Task15.main(new String[]{"505"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("2"));
    }

    @Test
    public void main3() throws Exception {

        Task15.main(new String[]{"555"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("3"));
    }

    @Test
    public void main4() throws Exception {

        Task15.main(new String[]{"303"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("0"));
    }

}