package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task12Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task12.main(new String[]{"321123"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("true"));
    }

    @Test
    public void main2() throws Exception {

        Task12.main(new String[]{"124123"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("false"));
    }

    @Test
    public void main3() throws Exception {

        Task12.main(new String[]{"111111"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("true"));
    }

}