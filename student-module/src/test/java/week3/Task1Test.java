package week3;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() {

        Task1.main(new String[]{"Самое сильное чувство разочарование Не обида не ревность и даже не ненависть после них остаётся хоть что-то в душе после разочарования пустота"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Min - и (1), max - разочарование (13)"));
    }

    @Test
    public void mainEmptyTest() {

        Task1.main(new String[]{""});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString(""));
    }
}
