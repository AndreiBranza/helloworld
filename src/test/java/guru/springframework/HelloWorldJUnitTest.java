package guru.springframework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldJUnitTest {

    @Test
    public void getHello() {
        assertEquals("Hello World!", HelloWorldJUnit.getHello());
    }
}