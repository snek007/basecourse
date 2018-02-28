package week2;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task1.main(new String[]{});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}"));
    }
}
