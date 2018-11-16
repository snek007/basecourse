package week3;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task6Test extends ConsoleWrapperFixture {

    @Test
    public void mainTest() {

        Task6.main(new String[]{"10001101001"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("(2,4) - цепочка нулей\n(5,6) - цепочка единиц"));
    }

    @Test
    public void mainTest2() {

        Task6.main(new String[]{"1000110100001"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("(9,12) - цепочка нулей\n(5,6) - цепочка единиц"));
    }

    @Test
    public void mainTest3() {

        Task6.main(new String[]{"10"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("(2,2) - цепочка нулей\n(1,1) - цепочка единиц"));
    }

    @Test
    public void mainEmptyTest() {

        Task6.main(new String[]{""});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString(""));
    }
}
