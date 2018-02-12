package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serhii on 12.02.18.
 */
public class Task2Test extends ConsoleWrapperFixture {
    @Test
    public void main() throws Exception {

        Task2.main(new String[]{"10", "-2", "100"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("100"));
    }

}