package week3;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task7Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() {

        Task7.main(new String[]{"А роза упала на лапу Азора"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("true"));
    }

    @Test
    public void mainTest2() {

        Task7.main(new String[]{"Я иду с мечем судия"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("true"));
    }

    @Test
    public void mainTest3() {

        Task7.main(new String[]{"Saippuakivikauppias"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("true"));
    }

    @Test
    public void mainTest4() {

        Task7.main(new String[]{"синхрофазотрон"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("false"));
    }

    @Test
    public void mainEmptyTest() {

        Task7.main(new String[]{""});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("true"));
    }
}
