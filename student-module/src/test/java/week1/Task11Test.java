package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task11Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task11.main(new String[]{"1"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("1 копейка"));
    }

    @Test
    public void main2() throws Exception {

        Task11.main(new String[]{"11"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("11 копеек"));
    }

    @Test
    public void main3() throws Exception {

        Task11.main(new String[]{"43"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("43 копейки"));
    }

    @Test
    public void main4() throws Exception {

        Task11.main(new String[]{"12"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("12 копеек"));
    }
}