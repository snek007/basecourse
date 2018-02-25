package week1;

import base.ConsoleWrapperFixture;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Task13Test extends ConsoleWrapperFixture {

    @Test
    public void main() throws Exception {

        Task13.main(new String[]{"200", "256"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Круг уместится в квадрат"));
    }

    @Test
    public void main2() throws Exception {

        Task13.main(new String[]{"315", "200"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Квадрат уместится в круг"));
    }

    @Test
    public void main3() throws Exception {

        Task13.main(new String[]{"255", "200"});

        String consoleResults = consoleOutByteArray.toString();
        restoreSystemOutAndPrintInterceptedMessages(consoleResults);

        Assert.assertThat(consoleResults, CoreMatchers.containsString("Фигуры не вмещаются друг в друга"));
    }


}