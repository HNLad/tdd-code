package tdd.code.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import tdd.code.maven.calculator.StringCalculator;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Simple test to assert that true is indeed true.
     */
    @Test
    public void testApp() {
        assertTrue(true, "This test will always pass");
    }
    
    /**
     * Test an empty string should return 0
     */
    @Test
    public void testEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
}
