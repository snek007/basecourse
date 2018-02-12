package week1;

import base.ConsoleWrapperFixture;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


public class Task4Test extends ConsoleWrapperFixture {

    @Test
    public void main(){
        Task4.main(new String[]{"0.23"});

        String consoleResult = consoleOutByteArray.toString();

        restoreSystemOutAndPrintInterceptedMessages(consoleResult);

        assertThat(consoleResult, containsString("true"));
    }


    @Test
    public void mainNeg(){
        Task4.main(new String[]{"1.23"});

        String consoleResult = consoleOutByteArray.toString();

        restoreSystemOutAndPrintInterceptedMessages(consoleResult);

        assertThat(consoleResult, containsString("false"));
    }
}

