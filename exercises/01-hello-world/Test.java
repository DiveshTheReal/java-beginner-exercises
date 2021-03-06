import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Test{

    private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @org.junit.Before
    public void setUpStreams() {
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @org.junit.After
    public void revertStreams() {
        System.setOut(sysOut);
    }

    @org.junit.Test
    public void testAdd() {
        App a = new App();
        a.main(new String[0]);
        //String str = "Junit is workingfefefeer fine";
        //assertEquals("Junit is work ing fine",str);
        assertEquals("Hello, World\n", outContent.toString());
    }
}
