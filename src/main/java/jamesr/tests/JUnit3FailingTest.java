package jamesr.tests;

import junit.framework.TestCase;

public class JUnit3FailingTest extends TestCase {

    public JUnit3FailingTest() {
        this(JUnit3FailingTest.class.getSimpleName());
    }

    public JUnit3FailingTest(String name) {
        super(name);
    }

    public void testFailure() {
        throw new RuntimeException("A test error message");
    }

    public void testAssertion() {
        assertEquals(false, true);
    }
}
