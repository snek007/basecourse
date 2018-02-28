package base;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ConsoleWrapperFixture {


    protected ByteArrayOutputStream consoleOutByteArray;

    @Before
    public void interceptSystemOut(){
        this.consoleOutByteArray = new ByteArrayOutputStream();
        System.setOut(new PrintStream(this.consoleOutByteArray));
    }

    @After
    public void restoreDefaultSystemOut(){
        consoleOutByteArray = null;
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }

    protected void restoreSystemOutAndPrintInterceptedMessages(String consoleResults) {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.println(consoleResults);
    }

}
