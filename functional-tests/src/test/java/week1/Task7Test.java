package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task7Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task7.main(new String[]{"2"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Winter"));
    }

    @Test
    public void main2() throws Exception {

        Task7.main(new String[]{"3"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Spring"));
    }

    @Test
    public void main3() throws Exception {

        Task7.main(new String[]{"8"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Summer"));
    }

    @Test
    public void main4() throws Exception {

        Task7.main(new String[]{"10"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Autumn"));
    }


    @Test
    public void mainNeg() throws Exception {

        Task7.main(new String[]{"-5"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Wrong input!"));
    }

}