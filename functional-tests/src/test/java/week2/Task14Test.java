package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task14Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() throws Exception {

        Task14.main(new String[]{"0"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("false"));
    }

    @Test
    public void main2Test() throws Exception {

        Task14.main(new String[]{"-242"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("false"));
    }

    @Test
    public void main3Test() throws Exception {

        Task14.main(new String[]{"7"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("true"));
    }

    @Test
    public void main4Test() throws Exception {

        Task14.main(new String[]{"117"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("false"));
    }

    @Test
    public void main5Test() throws Exception {

        Task14.main(new String[]{"639"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("false"));
    }
}
