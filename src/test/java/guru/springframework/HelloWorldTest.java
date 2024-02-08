package guru.springframework;

public class HelloWorldTest {

    public void testGetHello() {

        assert("Hello World!".equals(HelloWorld.getHello()));
    }
}