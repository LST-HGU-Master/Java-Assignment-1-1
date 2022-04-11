import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Prog11Test {

    @Test
    public void testPrintClassName()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Prog11.main(null);

        // assertion
        assertEquals("プログラミング実習" + System.lineSeparator(), bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }
}
