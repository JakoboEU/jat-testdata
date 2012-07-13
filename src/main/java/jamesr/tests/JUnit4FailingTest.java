package jamesr.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnit4FailingTest {

    @Test
    public void shouldFailWithError() {
        throw new RuntimeException("A test error message");
    }

    @Test
    public void shouldFailWithAssertion() {
        assertEquals(false, true);
    }
}
