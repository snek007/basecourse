package week1;

import base.ConsoleWrapperFixture;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class Task3Test extends ConsoleWrapperFixture {


    @Test
    public void main() throws Exception {

        Task3.main(new String[]{"7"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        assertThat(consoleResults, containsString("14"));

    }

    @Test
    public void main2() throws Exception {

        Task3.main(new String[]{"15"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        assertThat(consoleResults, containsString(""));

    }

}