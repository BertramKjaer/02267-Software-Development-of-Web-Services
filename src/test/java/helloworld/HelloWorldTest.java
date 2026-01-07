package helloworld;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        assertEquals("Hello, World!", HelloWorld.getMessage());
    }
}
