package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class Task5Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task5.main(new String[]{"8", "24"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("8"));
    }
    @Test
    public void main2() throws Exception {

        Task5.main(new String[]{"20", "85"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("85"));
    }
}

