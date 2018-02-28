package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task2Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task2.main(new String[]{});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("{20, 18, 16, 14, 12, 10, 8, 6, 4, 2}"));
    }
}
