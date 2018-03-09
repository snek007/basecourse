package week3;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task3Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() {

        Task3.main(new String[]{"иван васильевич"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Иван Васильевич"));
    }

    @Test
    public void mainEmptyTest() {

        Task3.main(new String[]{""});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString(""));
    }
}
