package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


public class Task4Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task4.main(new String[]{"3", "4", "5"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("true"));
    }
    @Test
    public void main2() throws Exception {

        Task4.main(new String[]{"3", "3", "5"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("false"));
    }
}

