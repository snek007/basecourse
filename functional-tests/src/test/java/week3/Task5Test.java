package week3;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task5Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() {

        Task5.main(new String[]{"яблоко груша арбуз груша арбуз огурец"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("яблоко груша арбуз огурец"));
    }

    @Test
    public void mainEmptyTest() {

        Task5.main(new String[]{""});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString(""));
    }
}
