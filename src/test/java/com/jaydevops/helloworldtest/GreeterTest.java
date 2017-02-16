package com.jaydevops.helloworldtest;

/*
 * This is a sample unit test file.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import com.jaydevops.helloworld.*;

public class GreeterTest {
    @Test public void testSayHelloMethod() {
        assertEquals("yellow", Greeter.sayHello());
    }
}
